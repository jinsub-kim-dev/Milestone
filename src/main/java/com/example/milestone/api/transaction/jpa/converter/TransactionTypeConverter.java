package com.example.milestone.api.transaction.jpa.converter;

import com.example.milestone.api.transaction.enums.TransactionType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class TransactionTypeConverter implements AttributeConverter<TransactionType, String> {

    @Override
    public String convertToDatabaseColumn(TransactionType type){
        return type.getValue();
    }

    @Override
    public TransactionType convertToEntityAttribute(String value){
        return TransactionType.of(value);
    }
}
