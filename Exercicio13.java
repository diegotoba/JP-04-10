import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13 {
  // Escreva um programa que receba como entrada um array de números inteiros e
  // retorne o maior valor presente no array.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quantos numeros voce quer comparar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0, maior = 0;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      if (maior <= novoNumero) {
        maior = novoNumero;
      }
      ;
      i++;

    }

    System.out.println("o maior numero é " + maior);
  }
}
