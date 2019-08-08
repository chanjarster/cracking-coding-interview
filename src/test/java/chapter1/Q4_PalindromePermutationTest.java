package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import chapter1.Q4_PalindromePermutation.Solution1;

public class Q4_PalindromePermutationTest {

  @Test
  public void testSolution1() {
    test(new Solution1());
  }

  @Test
  public void testSolution2() {
    test(new Q4_PalindromePermutation.Solution2());
  }

  private void test(Q4_PalindromePermutation solution) {
    assertEquals(solution.check("tactcoa"), true);
    assertEquals(solution.check("tactcoao"), true);
    assertEquals(solution.check("tactcoab"), false);
  }
}
