package com.example.maria.processor;

import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements ColumnProcessor {

    @Override
    public boolean isMatch(String fieldId) {
        return fieldId.equals("user");
    }

    @Override
    public String getValue(String fieldId, RowContext rowContext) {
        return fieldId + rowContext.getSomething();
    }
}
