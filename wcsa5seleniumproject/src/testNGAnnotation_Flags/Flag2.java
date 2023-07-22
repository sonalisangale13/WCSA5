package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description="Login Method",enabled=true)
  public void method1() {
	  Reporter.log("Method1 From Flag2",true);
	  
  }
  @Test(description="Logout Method",enabled=true)
  public void method2() {
	  Reporter.log("Method1 From Flag2",true);
	  
  }
}

//we can declare multiple flags for single annotations