package com.example.maria.processor;

public interface ColumnProcessor {

    boolean isMatch(String fieldId, Object column);

    String getKey(String fieldId, Object column);

}
