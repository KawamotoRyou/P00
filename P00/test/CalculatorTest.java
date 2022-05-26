import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 

		int expected = 5555;
		assertEquals (expected, actual);
	}
	public void testAddBoundary() {
		int a = 4321;
		int b = 1234;

		String str = Integer.toString(a);
		String str1 = Integer.toString(b);
		int length = 4;

		if(str.length() == length && str.length() == length) {
			if(a > 0 && b > 0 || a <= 9999 && b <= 9999) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 

			int expected = 5555;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testAddError() {
		int a = 4321;
		int b = 1234;

		if(a == (int)b && b == (int)b) {
			if( a > 0  && b > 0) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 

			int expected = 5555;
			assertEquals (expected, actual);
		}
	}


	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 

		int expected = 3087;
		assertEquals (expected, actual);
	}

	@Test
	public void testSubBoundary() {
		int a = 4321;
		int b = 1234;

		String str = Integer.toString(a);
		String str1 = Integer.toString(b);
		int length = 4;

		if(str.length() == length && str.length() == length) {
			if(a > 0 && b > 0 || a <= 9999 && b <= 9999) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b); 

			int expected = 3087;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testSubError() {
		int a = 4321;
		int b = 1234;

		if(a == (int)a && b == (int)b) {
			if( a > 0  && b > 0) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b); 

			int expected = 3087;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testMultiple() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 

		int expected = 5332114;
		assertEquals (expected, actual);
	}

	@Test
	public void testMulBoundary() {
		int a = 4321;
		int b = 1234;

		String str = Integer.toString(a);
		String str1 = Integer.toString(b);
		int length = 4;

		if(str.length() == length && str.length() == length) {
			if(a > 0 && b > 0 || a <= 9999 && b <= 9999) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b); 

			int expected = 5332114;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testMulError() {
		int a = 4321;
		int b = 1234;

		if(a == (int)a && b == (int)b) {
			if( a > 0  && b > 0) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b); 

			int expected = 5332114;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testDevide() {
		int a = 6666;
		int b = 3333;

		Calculator cal = new Calculator();
		int actual = cal.devide(a, b); 

		int expected = 2;
		assertEquals (expected, actual);
	}

	@Test
	public void testDevBoundary() {
		int a = 6666;
		int b = 3333;

		String str = Integer.toString(a);
		String str1 = Integer.toString(b);
		int length = 4;

		if(str.length() == length && str.length() == length) {
			if(a > 0 && b > 0 || a <= 9999 && b <= 9999) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.devide(a, b); 

			int expected = 2;
			assertEquals (expected, actual);
		}
	}

	@Test
	public void testDevError() {
		int a = 6666;
		int b = 3333;

		if(a == (int)a && b == (int)b) {
			if( a > 0  && b > 0) {
				assertTrue(true);
			}else {
				assertFalse(true);
			}
			Calculator cal = new Calculator();
			int actual = cal.devide(a, b); 

			int expected = 2;
			assertEquals (expected, actual);
		}
	}
}


