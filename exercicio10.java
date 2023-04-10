
public class exercicio10 {
  public static void main(String[] args) {
    int x = 17, y = 11;
    int i = 1, menor, maior;

    if (x > y) {
      menor = y;
      maior = x;
    } else {
      menor = x;
      maior = y;
    }

    while (i >= 1) {
      if ((menor * i) % maior == 0) {
        System.out.println("o MMC é " + (menor * i));
        break;
      } else {
        i++;
      }
    }
  }
}
