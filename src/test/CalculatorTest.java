package test;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSum1() throws Exception {
		double a = 1.4;
		double  b = 2.6;
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 4, wynik, 0.02);
	}

	@Test
	public void testSum2() throws Exception {
		double a = 3.4;
		double  b = 2.6;
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 6, wynik, 0.02);
	}
	
	@Test
	public void testSubtract1() throws Exception {
		double a = 3.4;
		double  b = 2.6;
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("bledny wynik odejmowania", 0.8, wynik, 0.02);
	}
	
	@Test
	public void testSubtract2() throws Exception {
		double a = 0;
		double  b = 2.6;
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("bledny wynik odejmowania", -2.6, wynik, 0.02);
	}
	
	@Test
	public void testMultiply1() throws Exception {
		double a = 0;
		double  b = 2.6;
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("bledny wynik mnozenia", 0, wynik, 0.02);
	}
	
	@Test
	public void testMultiply2() throws Exception {
		double a = 1;
		double  b = 2.6;
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("bledny wynik mnozenia", 2.6, wynik, 0.02);
	}
	
	@Test
	public void testDivide1() throws Exception {
		double a = 100;
		double  b = 25;
		double wynik = classUnderTest.divide(a, b);
		
		Assert.assertEquals("bledny wynik dzielenia", 4, wynik, 0.02);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivideBzZero() throws Exception {
		double a = 100;
		double  b = 0;
		classUnderTest.divide(a, b);
	}
}
