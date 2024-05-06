package TestCasess;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestingClass1 {
  @Test
  public void a() {
	  System.out.println("method - a from class1");
  }
  @Ignore
  @Test
  public void b() {
	  System.out.println("method - b from class1");
  }
  @Test
  public void c() {
	  System.out.println("method - c from class1");
  }
}
