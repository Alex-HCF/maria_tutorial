package com.example.maria;

import com.example.maria.processor.Facade;
import com.example.maria.processor.RowContext;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
class MariaApplicationTests {

	@Autowired
	private Facade facade;

	@Test
	void contextLoads() {
		List<String> input = List.of("project", "issue", "user", "_customField1");

		String something = "hello";

		RowContext context = RowContext.builder()
				.something(something).build();

		// ... business logic

		Map<String, String> output = input.stream().collect(Collectors.toMap((k) -> k, (k) -> facade.getValue(k, context)));
		output.forEach((key, value) -> System.out.println(key + ":" + value));
	}


}
