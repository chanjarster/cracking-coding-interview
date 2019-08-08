package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Q5_OneAwayTest {

  @Test
  public void testSolution1() {
    test(new Q5_OneAway.Solution1());
  }

  private void test(Q5_OneAway solution) {
    assertEquals(solution.check("pale", "pale"), true);
    assertEquals(solution.check("pale", "ple"), true);
    assertEquals(solution.check("pales", "pale"), true);
    assertEquals(solution.check("pale", "bale"), true);
    assertEquals(solution.check("pale", "bake"), false);
  }
}
