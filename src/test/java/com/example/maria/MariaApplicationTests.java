package com.example.maria;

import com.example.maria.processor.Facade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MariaApplicationTests {

	@Autowired
	private Facade facade;

	@Test
	void contextLoads() {
		System.out.printf("ss");
	}

}
