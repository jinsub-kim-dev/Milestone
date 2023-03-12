package com.example.milestone.api.transaction.enums;

import lombok.Getter;

@Getter
public enum TransactionType {
    INCOME("INCOME"),
    EXPENDITURE("EXPENTIDURE");

    final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public static TransactionType of(String value) {
        for (TransactionType type : values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Illegal TransactionType of " + value);
    }
}
