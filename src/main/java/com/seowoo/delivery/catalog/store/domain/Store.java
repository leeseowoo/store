package com.seowoo.delivery.catalog.store.domain;

import javax.persistence.*;

@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;

    private String storeName;

    private String address;

    private String phoneNumber;

    private String owner;

    private String introduction;

    private int minimumOrderAmount;

    private int deliveryTip;

    private boolean open;

    public Store(String storeName, String address, String phoneNumber, String owner, String introduction, int minimumOrderAmount, int deliveryTip, boolean open) {
        this.storeName = storeName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.introduction = introduction;
        this.minimumOrderAmount = minimumOrderAmount;
        this.deliveryTip = deliveryTip;
        this.open = open;
    }

    public Store() {

    }

    public Store(long storeId) {
        this.storeId = storeId;
    }

    public long getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getIntroduction() {
        return introduction;
    }

    public int getMinimumOrderAmount() {
        return minimumOrderAmount;
    }

    public int getDeliveryTip() {
        return deliveryTip;
    }

    public boolean isOpen() {
        return open;
    }
}
