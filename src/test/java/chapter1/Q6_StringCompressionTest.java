package chapter1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Q6_StringCompressionTest {

  @Test
  public void testSolution1() {
    testSolution(new Q6_StringCompression.Solution1());
  }

  @Test
  public void testSolution2() {
    testSolution(new Q6_StringCompression.Solution2());
  }

  private void testSolution(Q6_StringCompression solution) {
    assertEquals(solution.compress("aabcccccaaa"), "a2bc5a3");
    assertEquals(solution.compress("a"), "a");
    assertEquals(solution.compress("aa"), "aa");
    assertEquals(solution.compress("aab"), "aab");
    assertEquals(solution.compress("abcdefg"), "abcdefg");
  }
}
