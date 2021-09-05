package contador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaModelo {
	@BeforeClass
	public static void setupFirst() {
		System.out.println("Setup First");
	}
	
	@AfterClass
	public static void TearDownLast() {
		System.out.println("TearDown Last");
	}
	
	@Before
	public void setup() {
		System.out.println("setup");
	}
	
	@After
	public void TearDown() {
		System.out.println("TearDown");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
