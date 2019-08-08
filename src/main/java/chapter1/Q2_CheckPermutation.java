package chapter1;

import java.util.Arrays;

public interface Q2_CheckPermutation {

  boolean check(String a, String b);

  class Solution1 implements Q2_CheckPermutation {
    @Override
    public boolean check(String a, String b) {
      if (a.length() != b.length()) {
        return false;
      }
      char[] c1 = a.toCharArray();
      Arrays.sort(c1);
      String sortedA = String.valueOf(c1);
      char[] c2 = b.toCharArray();
      Arrays.sort(c2);
      String sortedB = String.valueOf(c2);
      for (int i = 0; i < a.length(); i++) {
        if (sortedA.charAt(i) != sortedB.charAt(i)) {
          return false;
        }
      }
      return true;
    }
  }

  class Solution2 implements Q2_CheckPermutation {
    @Override
    public boolean check(String a, String b) {
      if (a.length() != b.length()) {
        return false;
      }
      int[] charCountA = new int[128];
      for (int i = 0; i < a.length(); i++) {
        int pos = a.charAt(i);
        charCountA[pos]++;
      }
      int[] charCountB = new int[128];
      for (int i = 0; i < b.length(); i++) {
        int pos = b.charAt(i);
        charCountB[pos]++;
      }
      for (int i = 0; i < charCountA.length; i++) {
        if (charCountA[i] != charCountB[i]) {
          return false;
        }
      }
      return true;
    }
  }

  class Solution3 implements Q2_CheckPermutation {
    @Override
    public boolean check(String a, String b) {
      if (a.length() != b.length()) {
        return false;
      }
      int[] charCount = new int[128];
      for (int i = 0; i < a.length(); i++) {
        int pos = a.charAt(i);
        charCount[pos]++;
      }
      for (int i = 0; i < b.length(); i++) {
        int pos = b.charAt(i);
        charCount[pos]--;
      }
      for (int i = 0; i < charCount.length; i++) {
        if (charCount[i] != 0) {
          return false;
        }
      }
      return true;
    }
  }

  class Solution4 implements Q2_CheckPermutation {
    @Override
    public boolean check(String a, String b) {
      if (a.length() != b.length()) {
        return false;
      }
      int[] charCount = new int[128];
      for (int i = 0; i < a.length(); i++) {
        int pos = a.charAt(i);
        charCount[pos]++;
      }
      for (int i = 0; i < b.length(); i++) {
        int pos = b.charAt(i);
        charCount[pos]--;
        if (charCount[pos] < 0) {
          // b比a多了一个字符
          return false;
        }
      }
      return true;
    }
  }
}
