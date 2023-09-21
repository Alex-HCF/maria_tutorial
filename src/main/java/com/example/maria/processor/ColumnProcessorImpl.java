package com.example.maria.processor;

import org.springframework.stereotype.Component;

@Component
public class ColumnProcessorImpl implements ColumnProcessor {

    @Override
    public boolean isMatch(String fieldId, Object column) {
        return false;
    }

    @Override
    public String getKey(String fieldId, Object column) {
        return null;
    }
}
