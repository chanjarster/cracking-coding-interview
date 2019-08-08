package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chapter1.Q1_IsUnique.Solution1;
import chapter1.Q1_IsUnique.Solution2;
import chapter1.Q1_IsUnique.Solution3;

public class Q1_IsUniqueTest {

  String s1 = "fobarozyx";
  String s2 = "abefzpsln";

  @Test
  public void testSolution1() {
    test(new Solution1());
  }

  private void test(Q1_IsUnique isUnique) {
    assertEquals(isUnique.check(s1), false);
    assertEquals(isUnique.check(s2), true);
  }

  @Test
  public void testSolution2() {
    test(new Solution2());
  }

  @Test
  public void testSolution3() {
    test(new Solution3());
  }
}
