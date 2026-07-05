class Solution {
  public String encode(List<String> strs) {
    StringBuilder encodedString = new StringBuilder();

    strs.forEach(s -> encodedString.append(s.length()).append("#").append(s));
    return encodedString.toString();
  }

  public List<String> decode(String str) {
    int i = 0;
    int j = 0;

    List<String> decoded = new ArrayList<>();

    while (i < str.length()) {
      while (str.charAt(j) != '#') {
        j++;
      }
      int len = Integer.parseInt(str.substring(i, j));

      i = j + 1;
      j = i + len;

      decoded.add(str.substring(i, j));

      i = j;
    }
    return decoded;
  }
}
