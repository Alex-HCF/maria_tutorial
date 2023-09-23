package com.example.maria.processor;

import org.springframework.stereotype.Component;

@Component
public class CustomFieldProcessor implements ColumnProcessor {

    @Override
    public boolean isMatch(String fieldId) {
        return fieldId.equals("_customField1");
    }

    @Override
    public String getValue(String fieldId, RowContext rowContext) {
        return fieldId + rowContext.getSomething();
    }
}
