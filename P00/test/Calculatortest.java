import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculatortest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		//assert will check if the outcome is expected(9999)
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtract() {
		int a=9876;
		int b=4321;
		Calculator cal= new Calculator();
		int actual = cal.subtract(a, b);
		int expected=5555;
		assertEquals(actual,expected);
	}
	@Test
	public  void testMultiply() {
		int a=20;
		int b=5;
		Calculator cal= new Calculator();
		int actual = cal.multiply(a, b);
		int expected=100;
		assertEquals(actual,expected);
	}
	@Test 
	public  void testDivide() {
		int a=300;
		int b=5;
		Calculator cal= new Calculator();
		int actual = cal.divide(a, b);
		int expected=60;
		assertEquals(actual,expected);
	}

	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



}
