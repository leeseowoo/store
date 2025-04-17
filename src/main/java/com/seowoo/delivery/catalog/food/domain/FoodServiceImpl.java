package com.seowoo.delivery.catalog.food.domain;

import com.seowoo.delivery.catalog.food.controller.FoodDto;
import com.seowoo.delivery.catalog.food.infrastructure.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Food createFood(FoodDto.CreateFoodRequest request) {
        return foodRepository.save(request.toEntity());
    }

    @Override
    public List<Food> showFoodList(long storeId) {
        return foodRepository.findAllByStoreStoreId(storeId);
    }

    @Override
    public Food showFoodDetail(long foodId) {
        return foodRepository.findById(foodId).get();
    }
}
