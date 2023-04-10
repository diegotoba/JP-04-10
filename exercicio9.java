
public class exercicio9 {
  public static void main(String[] args) {
    int x = 35, y = 13;
    int mdc;

    if (x > y) {
      mdc = y;
    } else {
      mdc = x;
    }

    int i = mdc;

    while (i > 0) {
      if (x % i <= 0) {
        if (y % i <= 0) {
          mdc = i;
          break;
        } else {
          i -= 1;
        }
      } else {
        i -= 1;
      }

    }

    System.out.println("O MDC entre " + x + " e " + y + " é " + mdc);
  }
}
