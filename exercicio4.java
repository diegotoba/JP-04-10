public class exercicio4 {

  /**
   * @param arg
   */
  public static void main(String[] arg) {
    String string = new String("reviver");
    char[] chars = new char[7];

    string.getChars(0, 7, chars, 0);
    System.out.println(chars);

    if (chars[0] == chars[6] && chars[1] == chars[5] && chars[2] == chars[4]) {
      System.out.println(string + " é palindromo");
    }
  }
}