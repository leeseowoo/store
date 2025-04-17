package com.seowoo.delivery.catalog.food.domain;

import com.seowoo.delivery.catalog.food.controller.FoodDto;
import com.seowoo.delivery.catalog.store.domain.Store;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long foodId;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "food")
    private List<FoodOption> foodOptionList = new ArrayList<>();

    private String name;

    private int price;

    private String description;

    private boolean soldOut;

    public Food(long storeId, String name, int price, String description, boolean soldOut, List<FoodDto.CreateFoodOptionRequest> createFoodOptionRequestList) {
        this.store = new Store(storeId);
        this.name = name;
        this.price = price;
        this.description = description;
        this.soldOut = soldOut;

        for (FoodDto.CreateFoodOptionRequest foodOptionRequest : createFoodOptionRequestList) {
            FoodOption foodOption = new FoodOption(foodOptionRequest.getName(), foodOptionRequest.getButtonType(), foodOptionRequest.getOrdinal(), foodOptionRequest.getCreateOptionItemRequestList());
            this.foodOptionList.add(foodOption);
        }
    }

    public Food() {

    }

    public long getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSoldOut() {
        return soldOut;
    }
}
