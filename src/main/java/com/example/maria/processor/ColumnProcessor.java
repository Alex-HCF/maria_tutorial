package com.example.maria.processor;

public interface ColumnProcessor {

    boolean isMatch(String fieldId);

    String getValue(String fieldId, RowContext rowContext);

}
