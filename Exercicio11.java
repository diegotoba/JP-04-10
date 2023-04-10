import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {
  // Escreva um programa que receba como entrada um array de números inteiros e
  // calcule a soma de todos os elementos.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quants numeros voce quer somar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0, soma = 0;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      soma += novoNumero;
      i++;

    }

    System.out.println("a soma dos numeros inseridos é " + soma);
  }
}
