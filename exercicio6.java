public class exercicio6 {
  public static void main(String[] args) {

    System.out.println(0);
    System.out.println(1);
    int i = 0;
    int a = 1, b = 1;
    while (i < 150) {

      i = a + b;
      a = b;
      b = i;
      System.out.println(i);

    }
  }
}
