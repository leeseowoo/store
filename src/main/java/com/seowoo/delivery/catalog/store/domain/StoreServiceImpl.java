package com.seowoo.delivery.catalog.store.domain;

import com.seowoo.delivery.catalog.store.controller.StoreDto;
import com.seowoo.delivery.catalog.store.infrastructure.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{

    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store createStore(StoreDto.CreateStoreRequest request) {
        return storeRepository.save(request.toEntity());
    }
}
