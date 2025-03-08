package com.springboot.web.services;

public class CalculatorService {
public static int addTwoNumbers(int a,int b)
{
	return a+b;
}
public static int productTwoNumbers(int a,int b)
{
	return a*b;
}
public static int divideTwoNumbers(int a,int b)
{
	return a/b;
}
public static int sumAnyNumbers(int ...numbers)
{
	int sum=0;
	for(int i:numbers)
	{
		sum+=i;
	}
	return sum;
}
}
