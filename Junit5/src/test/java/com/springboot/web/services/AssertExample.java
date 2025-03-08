package com.springboot.web.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {
	@Test
	public void test1() {
		System.out.println("testing some assertion methods");
		float actual=10;
		Float expected=10.0f;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void testArray() {
		System.out.println("testing some assertion methods");
	int [] actualArray= {1,2,3,4,5};
	int [] expectedArray= {1,2,3,4,6};
	Assertions.assertArrayEquals(expectedArray, actualArray,"Wrong");
	}
	@Test
	public void testStrings() {
		System.out.println("testing some assertion methods");
		//string creation using new keyword
	String s1=new String("rahul");
	String s2=new String("rahul");
	//Assertions.assertEquals(s1, s2); //checks value , hence true 
	Assertions.assertSame(s1, s2); //checks address , hence false , because when we use new keyword then new object banta hai which takes different addresses
	}
	@Test
	public void testStringsLiterals() {
		System.out.println("testing some assertion methods");
		//string creation using literals
	String s1="rahul";
	String s2="rahul"; //s1 and s2 has same address
	Assertions.assertEquals(s1, s2); //checks value , hence true 
	//Assertions.assertSame(s1, s2); //checks address , hence true  
	}
	@Test
	public void testBoolean() {
		System.out.println("testing some assertion methods");
	boolean b=false;
	//Assertions.assertTrue(b); //false
	Assertions.assertFalse(b); //true
	}
	@Test
	public void testNull() {
		System.out.println("testing some assertion methods");
	
	String s=null;
	//Assertions.assertNull(s); //true
	Assertions.assertNotNull(s); //false
	}
}
