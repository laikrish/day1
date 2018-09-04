package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Squareofnumber;

class SquareofnumberTest {

	@Test
	void testcalculateSquare() {
		assertEquals(25,Squareofnumber.calculateSalary(5));
		assertEquals(25,Squareofnumber.calculateSalary(-5));
	}

}
