package com.seowoo.delivery.catalog.food.domain;

import com.seowoo.delivery.catalog.food.controller.FoodDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "food_option")
public class FoodOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long foodOptionId;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;

    @OneToMany(mappedBy = "foodOption")
    private List<OptionItem> optionItemList = new ArrayList<>();

    private String name;

    @Enumerated(EnumType.STRING)
    private ButtonType buttonType;

    private int ordinal;

    public FoodOption(String name, ButtonType buttonType, int ordinal, List<FoodDto.CreateOptionItemRequest> createOptionItemRequestList) {
        this.name = name;
        this.buttonType = buttonType;
        this.ordinal = ordinal;

        for (FoodDto.CreateOptionItemRequest optionItemRequest : createOptionItemRequestList) {
            OptionItem optionItem = new OptionItem(optionItemRequest.getName(), optionItemRequest.getPrice(), optionItemRequest.getOrdinal());
            this.optionItemList.add(optionItem);
        }
    }
}
