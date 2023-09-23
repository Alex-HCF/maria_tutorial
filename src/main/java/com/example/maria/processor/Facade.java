package com.example.maria.processor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Facade {

    private final List<ColumnProcessor> columnProcessors;

    public String getValue(String fieldId, RowContext rowContext) {
        ColumnProcessor columnProcessor1 = columnProcessors.stream().filter(columnProcessor -> columnProcessor.isMatch(fieldId))
                .findFirst().orElseThrow();
        return columnProcessor1.getValue(fieldId, rowContext);
    }


}
