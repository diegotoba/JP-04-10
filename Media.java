import java.util.Scanner;

public class Media {
	public static void main(String[] args) {

		double valor1, valor2, valor3, media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		valor1 = input.nextDouble();

		System.out.println("Digite o segundo valor: ");
		valor2 = input.nextDouble();

		System.out.println("Digite o terceiro valor: ");
		valor3 = input.nextDouble();

		media = (valor1 + valor2 + valor3) / 3;

		System.out.println("A média dos valores digitados é: " + media);
	}
}