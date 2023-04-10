import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio17 {
  // Escreva um programa que receba como entrada um array de números inteiros
  // e retorne um novo array com os valores do array original em ordem reversa.

  public static void main(String[] args) {
    HashMap<Integer, String> palavrasChave = new HashMap<Integer, String>();
    Scanner inserirPalavra = new Scanner(System.in);
    System.out.println("Quantas palavras voce quer registrar?");
    int numeroElementos = inserirPalavra.nextInt();
    for (int g = 0; g < numeroElementos; g++) {
      System.out.println("Digite a palavra chave");
      palavrasChave.put(g, inserirPalavra.nextLine());
    }

    for (Integer z : palavrasChave.keySet()) {
      System.out.println("chave: " + (z + 1) + " palavra: " + palavrasChave.get(z));
    }
  }
}
