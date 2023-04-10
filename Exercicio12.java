import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
  // Escreva um programa que receba como entrada um array de números inteiros e
  // retorne o menor valor presente no array.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quants numeros voce quer comparar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0, menor=1000;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      if ( menor > novoNumero) {menor = novoNumero;};
      i++;

    }

    System.out.println("o menor numero é " + menor);
  }
}
