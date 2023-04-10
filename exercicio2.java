public class exercicio2 {

  public static void main(String[] args) {
    double[] listaNumeros = { 1, 3, 4, 7, 11, 23, 42 };
    double soma = 0;
    for (double i : listaNumeros) {
      soma += i;
    }
    System.out.println(soma / listaNumeros.length);
  }
}
