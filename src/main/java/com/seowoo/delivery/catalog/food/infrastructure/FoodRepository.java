package com.seowoo.delivery.catalog.food.infrastructure;

import com.seowoo.delivery.catalog.food.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findAllByStoreStoreId(long storeId);
}
