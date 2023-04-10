import java.util.Scanner;

public class Votacao {
	public static void main(String[] args) {

		int idade;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		if (idade < 16) {
			System.out.println("Você não pode votar.");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Seu voto é opcional.");
		} else {
			System.out.println("Seu voto é obrigatório.");
		}
	}
}
