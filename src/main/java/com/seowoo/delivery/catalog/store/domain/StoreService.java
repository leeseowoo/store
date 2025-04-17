package com.seowoo.delivery.catalog.store.domain;

import com.seowoo.delivery.catalog.store.controller.StoreDto;

public interface StoreService {

    Store createStore(StoreDto.CreateStoreRequest request);
}
