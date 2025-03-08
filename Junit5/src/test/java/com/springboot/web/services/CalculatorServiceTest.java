package com.springboot.web.services;





import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



class CalculatorServiceTest {
	@BeforeAll
	public static void init()  //@BeforeAll methods must have a void return type and mustbe static by default
	{System.out.println("This method will execute before all test cases");
		
	}
	@BeforeEach
	public  void beforeEachTestCase()  //@BeforeEach methods must have a void return type and mustnot be static.
	{System.out.println("This method will execute before each test case");
		
	}
	@Test
@Tag("slow")  //Tags are used to filter which tests are executed for a given testplan. For example, a development team may tag tests with values such as "fast", "slow", "ci-server", etc. and then supply alist of tags to be included in or excluded from the current test plan,potentially dependent on the current environment. 
	void testAddTwoNumbers() {
		int actualResult=CalculatorService.addTwoNumbers(2, 3);
		int expectedResult=5;
//		Assertions.assertEquals(expectedResult, actualResult);
		assertEquals(expectedResult, actualResult); //we can write like this also
	}

	@Test
	void testProductTwoNumbers() {
		int actualResult=CalculatorService.productTwoNumbers(6, 7);
		int expectedResult=41;
		Assertions.assertEquals(expectedResult, actualResult,"Invalid result ");
	}

	@Test
	@Disabled  //@Disabled is used to signal that the annotated test class ortest method is currently disabled and should not be executed.
	void testDivideTwoNumbers() {
		//@Disabled is used to ignore a testcase
		int actualResult=CalculatorService.divideTwoNumbers(10, 5);
		int expectedResult=2;
		Assertions.assertEquals(expectedResult, actualResult);
	}

	@Test
	@DisplayName("SumAny") //@DisplayName is used to declare a custom displayname for the annotated test class or test method. 
	void testSumAnyNumbers() {
		int actualResult=CalculatorService.sumAnyNumbers(10, 5,4,6);
		int expectedResult=15;
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@AfterEach
	public  void afterEachTestCase()  //@AfterEach methods must have a void return type and mustnot be static.
	{System.out.println("This method will execute after each test case");
		
	}
	@AfterAll
	public static void cleanUp()   //@AfterAll methods must have a void return type and must be static by default.
	{System.out.println("This method will execute after all test cases");
		
	}

}
