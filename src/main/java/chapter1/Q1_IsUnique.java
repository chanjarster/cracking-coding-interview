package chapter1;

import java.util.Arrays;

public interface Q1_IsUnique {


  boolean check(String s);


  class Solution1 implements Q1_IsUnique {
    @Override
    public boolean check(String s) {
      if (s.length() <= 1) {
        return true;
      }
      long bitmap = 0L;
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        long bit = 1L << (c - 'a');
        if ((bitmap & bit) != 0L) {
          return false;
        }
        bitmap |= bit;
      }
      return true;
    }
  }

  class Solution2 implements Q1_IsUnique {
    @Override
    public boolean check(String s) {
      if (s.length() <= 1) {
        return true;
      }
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      for (int i = 1; i < chars.length; i++) {
        if (chars[i - 1] == chars[i]) {
          return false;
        }
      }
      return true;
    }
  }

  class Solution3 implements Q1_IsUnique {
    @Override
    public boolean check(String s) {
      if (s.length() <= 1) {
        return true;
      }
      if (s.length() > 128) {
        // 肯定存在重复
        return false;
      }
      boolean[] flags = new boolean[128];
      for (int i = 0; i < s.length(); i++) {
        int pos = s.charAt(i);
        if (flags[pos]) {
          return false;
        }
        flags[pos] = true;
      }
      return true;
    }
  }

}

