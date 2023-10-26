package Myproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import abc.App;

public class AppTest {
	@Test
	public void testlogin() {
		abc.App myapp =new App();
		Assert.assertEquals(1, myapp.User_Login("abc", "abc@123"));
	}
	
		@Test
		public void testlogin1() {
			abc.App myapp =new App();
			Assert.assertEquals(1, myapp.User_Login("Sagarika", "Ishika"));
		}
}
