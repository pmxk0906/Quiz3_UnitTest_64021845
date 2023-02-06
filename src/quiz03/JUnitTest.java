package quiz03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class JUnitTest {
	public class assertEqualTest{
		private String str1 = new String ("AABCAA")
		@BeforeClass
		public static void setup() {
			System.out.println("BeforeClass");
		}
		
		@Before
		public void init() {
			System.out.println("\nBefore Test Case");
			
			QuizOneJunit = new QuizOneJunit();
		}
		
		// Test1
		@Test(expected=int square.class)
		public void test1() {
			int x = 10;
			System.out.println("Square Area is : ");
		}
		
	}
	
	

}
