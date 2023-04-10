public class exercicio7 {
  public static void main(String[] args) {

    int numero = 24517;
    int soma = 0;
    while (numero > 0) {
      int digito = numero % 10;

      soma += digito;
      numero = numero / 10;

    }
    System.out.println(soma);
  }
}
