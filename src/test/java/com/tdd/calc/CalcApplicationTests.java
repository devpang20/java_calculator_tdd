package com.tdd.calc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class CalcApplicationTests {

	@Test
	@DisplayName("1 + 1 == 2")
	void t1() {
		assertThat(CalcApp.run("1 + 1")).isEqualTo(2);
	}

	@Test
	@DisplayName("1 + 1 == 6")
	void t2() {
		assertThat(CalcApp.run("1 + 1")).isEqualTo(6);
	}

	@Test
//	@DisplayName("2 + 2 == 4")


	@Test
//	@DisplayName("1000 + 280 == 1280")

}
