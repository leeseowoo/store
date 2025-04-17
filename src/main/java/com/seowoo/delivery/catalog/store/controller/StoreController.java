package com.seowoo.delivery.catalog.store.controller;

import com.seowoo.delivery.catalog.store.domain.Store;
import com.seowoo.delivery.catalog.store.domain.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stores")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping
    public ResponseEntity<StoreDto.CreateStoreResponse> CreateStore(@RequestBody StoreDto.CreateStoreRequest request) {
        Store store = storeService.createStore(request);
        StoreDto.CreateStoreResponse response = new StoreDto.CreateStoreResponse(store);
        return ResponseEntity.ok(response);
    }
}
