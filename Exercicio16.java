import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio16 {
  // Escreva um programa que receba como entrada um array de números inteiros
  // e retorne um novo array com os valores do array original em ordem reversa.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    ArrayList<Integer> invresa = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quantos numeros voce quer ordenar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      ;
      i++;

    }

    System.out.println("os numeros digitados sao:");
    for (Integer j = 0; j < lista.size(); j++) {
      System.out.println(lista.get((lista.size() - j) - 1));
    }
  }
}
