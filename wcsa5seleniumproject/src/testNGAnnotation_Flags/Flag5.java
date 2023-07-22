package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginMethod() 
  {
	  System.out.println("It is use to perform login!!");
  }
  
  @Test(dependsOnMethods="loginMethod") //performing priority wise without giving the priority
  public void createUserMethod() {
	  System.out.println("It is use to create user!!");
  }
  
  
  @Test(dependsOnMethods="createUserMethod")
  public void logoutMethod() {
  System.out.println("It is use to perform logout!!");
  }
  
}
