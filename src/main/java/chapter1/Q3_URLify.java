package chapter1;

public interface Q3_URLify {

  char[] convert(char[] url, int trueLength);

  class Solution1 implements Q3_URLify {
    @Override
    public char[] convert(char[] url, int trueLength) {

      if (url.length == trueLength) {
        return url;
      }
      char[] res = new char[url.length];
      int j = 0;
      for (int i = 0; i < trueLength; i++) {
        if (url[i] != ' ') {
          res[j++] = url[i];
        } else {
          res[j++] = '%';
          res[j++] = '2';
          res[j++] = '0';
        }
      }
      return res;
    }
  }

  class Solution2 implements Q3_URLify {
    @Override
    public char[] convert(char[] url, int trueLength) {
      if (url.length == trueLength) {
        return url;
      }
      int j = url.length - 1;
      for (int i = trueLength - 1; i >= 0; i--) {
        char c = url[i];
        if (c != ' ') {
          url[j--] = c;
        } else {
          url[j--] = '0';
          url[j--] = '2';
          url[j--] = '%';
        }
      }
      return url;
    }
  }
}
