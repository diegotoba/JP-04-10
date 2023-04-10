import java.util.ArrayList;
import java.util.Scanner;

public class DesafioQualFilme {
  public static void main(String[] args) {
    ArrayList<String> dicas = new ArrayList<String>();
    String nomeFilme, palpite;
    Scanner input = new Scanner(System.in);

    System.out.println("Iniciar jogo");
    System.out.println("Jogador 1, digite o nome do filme");
    nomeFilme = input.nextLine();

    for (int i = 1; i <= 5; i++) {
      System.out.println("Digite a dica " + i);
      dicas.add(input.nextLine());
    }

    System.out.println("É a vez do jogador 2 adivnhar o  filme.");
    int j = 1;
    while (j <= 5) {
      System.out.println("Dica " + j);
      System.out.println(dicas.get(j - 1));
      System.out.println("Digite o seu palpite: ");
      palpite = input.nextLine();

      if (palpite.equals(nomeFilme)) {
        System.out.println("Parabéns, você acertou");
        break;
      } else {
        System.out.println("Você errou. Próxima dica.");
        System.out.println(palpite + " " + nomeFilme);
        j++;
      }
      ;
    }

    switch (j) {
      case 1:
        System.out.println("O jogador 2 fez 100 pontos!");
        break;
      case 2:
        System.out.println("O jogador 2 fez 60 pontos!");
        break;
      case 3:
        System.out.println("O jogador 2 fez 40 pontos!");
        break;
      case 4:
        System.out.println("O jogador 2 fez 20 pontos!");
        break;
      case 5:
        System.out.println("O jogador 2 fez 10 pontos!");
        break;
      case 6:
        System.out.println("O jogador 2 tentou acertar o filme com 5 dicas e falhou miseravelmente");
        break;
    }
  }
}
