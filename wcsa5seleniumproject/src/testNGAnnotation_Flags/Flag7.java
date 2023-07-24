package testNGAnnotation_Flags;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void loginMethod() 
  {	  

  
	  System.out.println("It is use to perform login!!");
  }
  
  @Test(dependsOnMethods="loginMethod") //performing priority wise without giving the priority
  public void createUserMethod() {
	  Assert.fail();
	  System.out.println("It is use to create user!!");
  }
  
  
  @Test(dependsOnMethods="createUserMethod",alwaysRun=true)
  public void logoutMethod() {

  System.out.println("It is use to perform logout!!");
  }
  
}
