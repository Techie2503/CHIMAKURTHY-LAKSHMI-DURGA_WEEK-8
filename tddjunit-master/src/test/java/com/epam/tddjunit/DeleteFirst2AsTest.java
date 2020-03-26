package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteFirst2AsTest {
	/*
	 * 1) first char is A :ABCD->BCD
	 * 2)second char is A:BACD->BCD
	 * 3)first 2 char is A:AACD->CD
	 * 4)no A in first two characters:BBAA->BBAA
	 * 5)A in remaining part of string along with first 2 characters:
	 * AABAA->BAA
	 * 6)when string is empty:''->''
	 * 7)when string length is 1 and contains A
	 * A->''
	 * 8)when string length is 1 and does not contain A
	 * B->B
	 * 9)two A in length2 AA->''
	 * 10)one A in length2 AB->'B'
	 * 11)one A in length2 BA->'B'
	 * 12)No A in length2 BB->'BB'
	 * 
	 */
	DeleteFirst2As deleteFirst2As;
	@BeforeEach
	void setup()
	{
		 deleteFirst2As =new DeleteFirst2As();	
	}
	@Test
	void testFirstCharA() {
		assertEquals("BCD",deleteFirst2As.delete("ABCD"));
	}
	@Test
	void testSecondCharA() {
		assertEquals("BCD",deleteFirst2As.delete("BACD"));
	}
	@Test
	void testBothCharA()
	{
	
		assertEquals("CD",deleteFirst2As.delete("AACD"));
	}
	@Test
	void testNoAInFirstTwoPlaces()
	{
		assertEquals("BBAA",deleteFirst2As.delete("BBAA"));
	}
	@Test
	void testAInRemainingPart()
	{
		
		assertEquals("BAA",deleteFirst2As.delete("AABAA"));
	}
	@Test
	void testEmpty()
	{
		assertEquals("",deleteFirst2As.delete(""));
	}
	@Test
	void testSingleA()
	{
		
		assertEquals("",deleteFirst2As.delete("A"));
	}
	@Test
	void testNoAInLen1()
	{
		assertEquals("B",deleteFirst2As.delete("B"));
	}
	@Test
	void testTwoAInLen2()
	{
		assertEquals("",deleteFirst2As.delete("AA"));
	}
	@Test
	void testoneAInLen2()
	{
		assertEquals("B",deleteFirst2As.delete("AB"));
	}
	@Test
	void testoneAInLen2pos2()
	{
		assertEquals("B",deleteFirst2As.delete("BA"));
	}
	@Test
	void testNoAInLen2()
	{
		assertEquals("BB",deleteFirst2As.delete("BB"));
	}
}
