package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//it is used to describe the method or test case
  @Test(description="Login Method!")
  public void method1() {
	  Reporter.log("method1 From Flag1",true);
  
}

@Test(description="Login Method!")
public void method2() {
	  
	  Reporter.log("method2 From Flag1",true);
}
}