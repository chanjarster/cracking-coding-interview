package chapter1;

public interface Q5_OneAway {

  boolean check(String a, String b);

  class Solution1 implements Q5_OneAway {
    @Override
    public boolean check(String a, String b) {
      int countDiff = Math.abs(a.length() - b.length());
      if (countDiff > 1) {
        return false;
      }
      if (countDiff == 0) {
        return isOneReplaceAway(a, b);
      }
      if (a.length() < b.length()) {
        return isOneInsertAway(a, b);
      }
      return isOneInsertAway(b, a);
    }

    boolean isOneReplaceAway(String a, String b) {
      int diffCount = 0;
      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != b.charAt(i)) {
          diffCount++;
        }
        if (diffCount > 1) {
          return false;
        }
      }
      return true;
    }

    boolean isOneInsertAway(String a, String b) {
      int diffCount = 0;
      int i = 0;
      int j = 0;
      while (i < a.length()) {
        if (a.charAt(i) != b.charAt(j)) {
          diffCount++;
          j++;
        } else {
          i++;
          j++;
        }
        if (diffCount > 1) {
          return false;
        }
      }
      return true;
    }
  }
}
