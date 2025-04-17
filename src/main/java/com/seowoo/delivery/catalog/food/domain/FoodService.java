package com.seowoo.delivery.catalog.food.domain;

import com.seowoo.delivery.catalog.food.controller.FoodDto;

import java.util.List;

public interface FoodService {

    Food createFood(FoodDto.CreateFoodRequest request);

    List<Food> showFoodList(long storeId);

    Food showFoodDetail(long foodId);
}
