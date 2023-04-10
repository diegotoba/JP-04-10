import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
  // 1. Escreva um programa que receba como entrada um número inteiro positivo e
  // imprima na tela todos os números primos menores ou iguais a ele.
  public static void main(String[] args) {
    Scanner digitarNumero = new Scanner(System.in);
    System.out.println("digite o  numero a ser analisado");
    int numeroTeste = digitarNumero.nextInt();
    ArrayList<Integer> primos = new ArrayList<Integer>();

    for (Integer i = 2; i <= numeroTeste; i++) {
      Boolean ePrimo = true;
      int n = 2;
      while (n < i) {
        if (i % n == 0) {
          ePrimo = false;
          n++;
        } else {
          n++;
        }
        ;
      }

      if (ePrimo == true) {
        primos.add(i);
      }
      ;

    }
    System.out.println("Os numeros primos menores que " + numeroTeste + " sao:");
    System.out.println(primos);

  }
}