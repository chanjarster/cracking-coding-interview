package chapter1;

public interface Q4_PalindromePermutation {

  boolean check(String s);

  class Solution1 implements Q4_PalindromePermutation {
    @Override
    public boolean check(String s) {
      int oddCount = 0;
      int evenCount = 0;
      int[] charCount = new int[128];
      for (int i = 0; i < s.length(); i++) {
        int pos = s.charAt(i);
        if (pos == ' ') {
          continue;
        }
        charCount[pos]++;
        if (charCount[pos] % 2 == 0) {
          evenCount++;
          oddCount--;
        } else {
          oddCount++;
          if (evenCount > 0) {
            evenCount--;
          }
        }
      }
      if (oddCount > 1) {
        return false;
      }
      return true;
    }
  }

  class Solution2 implements Q4_PalindromePermutation {
    @Override
    public boolean check(String s) {
      int oddCount = 0;
      int[] charCount = new int[128];
      for (int i = 0; i < s.length(); i++) {
        int pos = s.charAt(i);
        if (pos == ' ') {
          continue;
        }
        charCount[pos]++;
        if (charCount[pos] % 2 == 0) {
          oddCount--;
        } else {
          oddCount++;
        }
      }
      if (oddCount > 1) {
        return false;
      }
      return true;
    }
  }
}
