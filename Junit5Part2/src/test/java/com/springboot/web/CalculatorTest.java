package com.springboot.web;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testDoSUm() {
		int actualResult=Calculator.doSUm(2, 3);
		int expectedResult=5;
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testDoProduct() {
		int actualResult=Calculator.doProduct(5, 10);
		int expectedResult=15;
		assertThat(actualResult).withFailMessage("should be %s",expectedResult).isEqualTo(expectedResult);
	}
	@Test
	public void testcompareTwoNums()
	{
		boolean actualResult=Calculator.compareTwoNums(2, 2);
		boolean expectedResult=false;
		//assertThat(actualResult).withFailMessage("should be %s",expectedResult).isEqualTo(expectedResult);
		assertThat(actualResult).isTrue();
	}

}
