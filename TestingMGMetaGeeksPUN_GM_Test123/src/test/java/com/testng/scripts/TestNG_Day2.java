package com.testng.scripts;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNG_Day2 {
  @Test(dataProvider = "dp")
  public void f(Integer EmpId, String Empno) {
	  System.out.println("Emp id is " + EmpId);
	  System.out.println("Emp no is " + Empno);
  }
  
  public void f1(Integer EmpId, String Empno) {
	  System.out.println(EmpId + Empno);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}