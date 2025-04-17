package com.seowoo.delivery.catalog.food.controller;

import com.seowoo.delivery.catalog.food.domain.Food;
import com.seowoo.delivery.catalog.food.domain.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/foods")
    public ResponseEntity<FoodDto.CreateFoodResponse> CreateFood(@RequestBody FoodDto.CreateFoodRequest request) {
        Food food = foodService.createFood(request);
        FoodDto.CreateFoodResponse response = new FoodDto.CreateFoodResponse(food);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{storeId}/foods")
    public ResponseEntity<FoodDto.FoodListResponse> showFoodList(@PathVariable long storeId) {
        List<Food> foodList = foodService.showFoodList(storeId);
        FoodDto.FoodListResponse response = new FoodDto.FoodListResponse(foodList);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/foods/{foodId}")
    public ResponseEntity<FoodDto.FoodDetailResponse> showFoodDetail(@PathVariable long foodId) {
        Food food = foodService.showFoodDetail(foodId);
        FoodDto.FoodDetailResponse response = new FoodDto.FoodDetailResponse(food);
        return ResponseEntity.ok(response);
    }
}
