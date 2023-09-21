package com.example.maria.processor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Facade {

    private final List<ColumnProcessor> columnProcessors;

    public String getKey(String fieldId, Object column) {
        ColumnProcessor columnProcessor1 = columnProcessors.stream().filter(columnProcessor -> columnProcessor.isMatch(fieldId, column))
                .findFirst().orElseThrow();
        return columnProcessor1.getKey(fieldId, column);
    }


}
