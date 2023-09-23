package com.example.maria.processor;

import org.springframework.stereotype.Component;

@Component
public class IssueProcessor implements ColumnProcessor {

    @Override
    public boolean isMatch(String fieldId) {
        return fieldId.equals("issue");
    }

    @Override
    public String getValue(String fieldId, RowContext rowContext) {
        return fieldId + rowContext.getSomething();
    }
}
