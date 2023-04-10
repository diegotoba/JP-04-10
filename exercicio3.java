public class exercicio3 {

  public static void main(String[] arg) {
    int maior = 0;
    int[] listaNumeros = { 3, 6, 1, 2, 23, 3, 12, 54 };
    for (int i : listaNumeros) {
      if (i > maior) {
        maior = i;
      }
      ;
    }
    System.out.println("o maior numero é: " + maior);

  }
}