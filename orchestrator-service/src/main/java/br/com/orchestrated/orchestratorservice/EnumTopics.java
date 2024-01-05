package br.com.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumTopics {

    START_SAGA("start-saga"),
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCCESS("finis_success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCCESS("produt-validation-success"),
    PRODUCT_VALIDATION_FAIL("produt-validation-fail"),

    PAYMENT_SUCCESS("payment-success"),
    PAYMENT_FAIL("payment-fail"),

    INVENTORY_SUCCESS("inventory-success"),
    INVENTORY_FAIL("inventory-fail"),

    NOTIFY_ENDING("notify-ending");
    private String topic;

    EnumTopics(String topic) {
        this.topic = topic;
    }
}
