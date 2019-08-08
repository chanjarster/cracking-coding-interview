package chapter1;

public interface Q6_StringCompression {

  String compress(String s);

  class Solution1 implements Q6_StringCompression {
    @Override
    public String compress(String s) {
      if (s.length() <= 2) {
        return s;
      }
      StringBuilder sb = new StringBuilder();
      char prevChar = s.charAt(0);
      int count = 1;
      for (int i = 1; i <= s.length(); i++) {
        if (i == s.length()) {
          appendChar(sb, prevChar, count);
          break;
        }
        char currChar = s.charAt(i);
        if (currChar == prevChar) {
          count++;
        } else {
          appendChar(sb, prevChar, count);
          prevChar = currChar;
          count = 1;
        }
      }
      if (sb.length() >= s.length()) {
        return s;
      }
      return sb.toString();
    }

    private void appendChar(StringBuilder sb, char c, int count) {
      if (count >= 2) {
        sb.append(c);
        sb.append(count);
      } else {
        sb.append(c);
      }
    }
  }

  class Solution2 implements Q6_StringCompression {
    @Override
    public String compress(String s) {
      if (s.length() <= 2) {
        return s;
      }
      int compressedLength = compressedLength(s);
      if (compressedLength >= s.length()) {
        return s;
      }
      StringBuilder sb = new StringBuilder(compressedLength);
      char prevChar = s.charAt(0);
      int count = 1;
      for (int i = 1; i <= s.length(); i++) {
        if (i == s.length()) {
          appendChar(sb, prevChar, count);
          break;
        }
        char currChar = s.charAt(i);
        if (currChar == prevChar) {
          count++;
        } else {
          appendChar(sb, prevChar, count);
          prevChar = currChar;
          count = 1;
        }
      }
      return sb.toString();
    }

    private void appendChar(StringBuilder sb, char c, int count) {
      if (count >= 2) {
        sb.append(c);
        sb.append(count);
      } else {
        sb.append(c);
      }
    }

    private int compressedLength(String s) {
      int compressedLength = 0;
      char prevChar = s.charAt(0);
      int count = 1;
      for (int i = 1; i <= s.length(); i++) {
        if (i == s.length()) {
          compressedLength += compressedLength(count);
          break;
        }
        char currChar = s.charAt(i);
        if (currChar == prevChar) {
          count++;
        } else {
          compressedLength += compressedLength(count);
          prevChar = currChar;
          count = 1;
        }
      }
      return compressedLength;
    }

    private int compressedLength(int count) {
      if (count <= 2) {
        return count;
      }
      return 1 + String.valueOf(count).length();
    }
  }
}
