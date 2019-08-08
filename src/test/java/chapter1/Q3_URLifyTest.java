package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Q3_URLifyTest {

  @Test
  public void testSolution1() {
    testSolution(new Q3_URLify.Solution1());
  }

  @Test
  public void testSolution2() {
    testSolution(new Q3_URLify.Solution2());
  }

  private void testSolution(Q3_URLify urLify) {
    char[] convert = urLify.convert("Mr John Smith    ".toCharArray(), 13);
    assertEquals(String.valueOf(convert), "Mr%20John%20Smith");
  }
}
