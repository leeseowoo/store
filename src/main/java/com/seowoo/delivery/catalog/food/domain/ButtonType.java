package com.seowoo.delivery.catalog.food.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ButtonType {

    CHECK_BOX, RADIO_BUTTON;

    @JsonCreator
    public static ButtonType forValue(String value) {
        for (ButtonType buttonType : ButtonType.values()) {
            if (buttonType.name().equals(value)) {
                return buttonType;
            }
        }

        return null;
    }
}
