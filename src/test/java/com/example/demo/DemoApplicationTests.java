package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("주어진 값이 10이 맞는지 확인")
	void isTenTest() {
		//given
		int givenNumber = 10;

		//when
		NumberTest test = new NumberTest();
		boolean result = test.isTen(givenNumber);

		//then
		assertThat(result).isTrue();
	}

	@Test
	@DisplayName("주어진 값이 10이 맞는지 확인 - 실패케이스")
	void isNotTenTest() {
		//given
		int givenNumber = 8;

		//when
		NumberTest test = new NumberTest();
		boolean result = test.isTen(givenNumber);

		//then
		assertThat(result).isTrue();
	}
}
