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
	@DisplayName("2 + 1 == 3")
	void t2() {
		assertThat(CalcApp.run("2 + 1")).isEqualTo(3);
	}

	@Test
	@DisplayName("2 + 2 == 4")
	void t3 () {
		assertThat(CalcApp.run("2 + 2")).isEqualTo(4);
	}

	@Test
	@DisplayName("1000 + 280 == 1280")
	void t4 () {
		assertThat(CalcApp.run("1000 + 280")).isEqualTo(1280);
	}

	@Test
	@DisplayName("2 - 1 == 1")
	void t5() {
		assertThat(CalcApp.run("2 - 1")).isEqualTo(1);
	}



	@Test
	@DisplayName("3 - 1 == 2")
	void t6() {
		assertThat(CalcApp.run("3 - 1")).isEqualTo(2);
	}
	@Test
	@DisplayName("100 - 20 == 80")
	void t7() {
		assertThat(CalcApp.run("100 - 20")).isEqualTo(80);
	}

	@Test
	@DisplayName("9 * 5 == 45")
	void t8() {
		assertThat(CalcApp.run("9 * 5")).isEqualTo(45);
	}

	@Test
	@DisplayName("1 * 7 == 7")
	void t9() {
		assertThat(CalcApp.run("1 * 7")).isEqualTo(7);
	}
}
