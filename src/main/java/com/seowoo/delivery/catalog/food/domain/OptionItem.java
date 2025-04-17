package com.seowoo.delivery.catalog.food.domain;

import javax.persistence.*;

@Entity
@Table(name = "option_item")
public class OptionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long optionItemId;

    @ManyToOne
    @JoinColumn(name = "food_option_id")
    private FoodOption foodOption;

    private String name;

    private int price;

    private int ordinal;

    public OptionItem(String name, int price, int ordinal) {
        this.name = name;
        this.price = price;
        this.ordinal = ordinal;
    }
}
