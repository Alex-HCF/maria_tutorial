package com.example.maria.processor;

import org.springframework.stereotype.Component;

@Component
public class ProjectProcessor implements ColumnProcessor {

    @Override
    public boolean isMatch(String fieldId) {
        return fieldId.equals("project");
    }

    @Override
    public String getValue(String fieldId, RowContext rowContext) {
        return fieldId + rowContext.getSomething();
    }
}
