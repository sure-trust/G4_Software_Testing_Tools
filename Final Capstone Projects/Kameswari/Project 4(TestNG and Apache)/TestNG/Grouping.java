package testng;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="regression")
  public void testcase1() {
	  System.out.println("Testcase 1");
  }
  @Test(groups= {"sanity","smoke"})
  public void testcase2() {
	  System.out.println("Testcase 2");
  }
  @Test(groups= {"smoke","regression"})
  public void testcase3() {
	  System.out.println("Testcase 3");
  }
  @Test
  public void testcase4() {
	  System.out.println("Testcase 4");
  }
}
