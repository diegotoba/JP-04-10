import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio2 {
  // Escreva um programa que receba como entrada um array de números inteiros e
  // retorne o segundo maior número presente no array.

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quantos numeros voce quer comparar?");
    int numeroElementos = inserirNumero.nextInt();
    int i = 0;

    while (i < numeroElementos) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      lista.add(novoNumero);
      ;
      i++;

    }

    Collections.sort(lista);
    System.out.println("o segundo maior numero é " + lista.get(numeroElementos - 2));
  }
}
