package com.seowoo.delivery.catalog.store.controller;

import com.seowoo.delivery.catalog.store.domain.Store;

public class StoreDto {

    public static class CreateStoreRequest {

        private String storeName;
        private String address;
        private String phoneNumber;
        private String owner;
        private String introduction;
        private int minimumOrderAmount;
        private int deliveryTip;
        private boolean open;

        public Store toEntity() {
            return new Store(this.storeName, this.address, this.phoneNumber, this.owner, this.introduction, this.minimumOrderAmount, this.deliveryTip, this.open);
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public void setMinimumOrderAmount(int minimumOrderAmount) {
            this.minimumOrderAmount = minimumOrderAmount;
        }

        public void setDeliveryTip(int deliveryTip) {
            this.deliveryTip = deliveryTip;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }
    }

    public static class CreateStoreResponse {

        private final long storeId;
        private final String storeName;
        private final String address;
        private final String phoneNumber;
        private final String owner;
        private final String introduction;
        private final int minimumOrderAmount;
        private final int deliveryTip;
        private final boolean open;

        public CreateStoreResponse(Store store) {
            this.storeId = store.getStoreId();
            this.storeName = store.getStoreName();
            this.address = store.getAddress();
            this.phoneNumber = store.getPhoneNumber();
            this.owner = store.getOwner();
            this.introduction = store.getIntroduction();
            this.minimumOrderAmount = store.getMinimumOrderAmount();
            this.deliveryTip = store.getDeliveryTip();
            this.open = store.isOpen();
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

}
