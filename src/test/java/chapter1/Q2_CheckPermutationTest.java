package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Q2_CheckPermutationTest {

  @Test
  public void testSolution1() {
    testSolution(new Q2_CheckPermutation.Solution1());
  }

  @Test
  public void testSolution2() {
    testSolution(new Q2_CheckPermutation.Solution2());
  }

  @Test
  public void testSolution3() {
    testSolution(new Q2_CheckPermutation.Solution3());
  }

  private void testSolution(Q2_CheckPermutation solution) {
    assertEquals(solution.check("bbacacege", "aacbcbeeg"), true);
    assertEquals(solution.check("bbacacege", "aacbcbee"), false);
    assertEquals(solution.check("bbacacege", "aacbcbegg"), false);
  }
}
