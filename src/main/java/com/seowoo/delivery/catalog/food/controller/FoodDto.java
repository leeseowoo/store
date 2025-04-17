package com.seowoo.delivery.catalog.food.controller;

import com.seowoo.delivery.catalog.food.domain.ButtonType;
import com.seowoo.delivery.catalog.food.domain.Food;

import java.util.List;

public class FoodDto {

    public static class CreateFoodRequest {

        private long storeId;
        private String name;
        private int price;
        private String description;
        private boolean soldOut;
        private List<CreateFoodOptionRequest> createFoodOptionRequestList;

        public Food toEntity() {
            return new Food(this.storeId, this.name, this.price, this.description, this.soldOut, this.createFoodOptionRequestList);
        }

        public void setStoreId(long storeId) {
            this.storeId = storeId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setSoldOut(boolean soldOut) {
            this.soldOut = soldOut;
        }

        public void setCreateFoodOptionRequestList(List<CreateFoodOptionRequest> createFoodOptionRequestList) {
            this.createFoodOptionRequestList = createFoodOptionRequestList;
        }
    }

    public static class CreateFoodOptionRequest {

        private String name;
        private ButtonType buttonType;
        private int ordinal;
        private List<CreateOptionItemRequest> createOptionItemRequestList;

        public String getName() {
            return name;
        }

        public ButtonType getButtonType() {
            return buttonType;
        }

        public int getOrdinal() {
            return ordinal;
        }

        public List<CreateOptionItemRequest> getCreateOptionItemRequestList() {
            return createOptionItemRequestList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setButtonType(ButtonType buttonType) {
            this.buttonType = buttonType;
        }

        public void setOrdinal(int ordinal) {
            this.ordinal = ordinal;
        }

        public void setCreateOptionItemRequestList(List<CreateOptionItemRequest> createOptionItemRequestList) {
            this.createOptionItemRequestList = createOptionItemRequestList;
        }
    }

    public static class CreateOptionItemRequest {

        private String name;
        private int price;
        private int ordinal;

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getOrdinal() {
            return ordinal;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setOrdinal(int ordinal) {
            this.ordinal = ordinal;
        }
    }

    public static class CreateFoodResponse {

        private final long foodId;
        private final String name;
        private final int price;
        private final String description;
        private final boolean soldOut;

        public CreateFoodResponse(Food food) {
            this.foodId = food.getFoodId();
            this.name = food.getName();
            this.price = food.getPrice();
            this.description = food.getDescription();
            this.soldOut = food.isSoldOut();
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

    public static class FoodListResponse {

        private final List<Food> foodList;

        public FoodListResponse(List<Food> foodList) {
            this.foodList = foodList;
        }

        public List<Food> getFoodList() {
            return foodList;
        }
    }

    public static class FoodDetailResponse {

        private final long foodId;
        private final String name;
        private final int price;
        private final String description;
        private final boolean soldOut;

        public FoodDetailResponse(Food food) {
            this.foodId = food.getFoodId();
            this.name = food.getName();
            this.price = food.getPrice();
            this.description = food.getDescription();
            this.soldOut = food.isSoldOut();
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
}
