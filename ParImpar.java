import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {

		int numero;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		numero = input.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " é um número par");
		} else {
			System.out.println(numero + " é um número ímpar");
		}
	}
}