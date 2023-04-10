import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio15 {
  // Escreva um programa que receba como entrada um array de números inteiros e
  // retorne um novo array com apenas os valores pares do array original.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    ArrayList<Integer> pares = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quantos numeros voce quer comparar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      if (novoNumero % 2 == 0) {
        pares.add(novoNumero);
      }
      ;
      i++;

    }

    System.out.println("os numeros pares sao:");
    for (Integer j : pares) {
      System.out.println(j);
    }
  }
}
