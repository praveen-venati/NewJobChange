package com.challenges;

import junit.framework.TestCase;

public class NumberToWordTest extends TestCase {

	private NumberToWordImplementation finder;

	public NumberToWordTest() {
		super("Number To  Word Implementation Test");
	}

	public void test_1() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(0);
		assertTrue(numberToWord.equalsIgnoreCase("zero"));
	}

	public void test_2() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(-1122222);
		assertTrue(numberToWord.equalsIgnoreCase("negative one million one hundred twenty two thousand two hundred twenty two"));
	}

	public void test_3() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(999999999);
		assertTrue(numberToWord.equalsIgnoreCase("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine"));
	}

	public void test_4() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(1);
		assertTrue(numberToWord.equalsIgnoreCase("one"));
	}

	public void test_5() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(21);
		assertTrue(numberToWord.equalsIgnoreCase("twenty one"));
	}

	public void test_6() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(105);
		assertTrue(numberToWord.equalsIgnoreCase("one hundred five"));
	}

	public void test_7() {

		this.finder = new NumberToWordImplementation();
		String numberToWord = this.finder.findMissingValues(56945781);
		assertTrue(numberToWord.equalsIgnoreCase("fifty six million nine hundred forty five thousand seven hundred eighty one"));
	}
}
