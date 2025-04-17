package com.seowoo.delivery.catalog.store.infrastructure;

import com.seowoo.delivery.catalog.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
