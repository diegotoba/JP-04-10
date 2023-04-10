import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int numero1 = input.nextInt();

		System.out.println("Digite o segundo número: ");
		int numero2 = input.nextInt();

		System.out.println("Digite o terceiro número: ");
		int numero3 = input.nextInt();

		int maior;

		if (numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		} else if (numero2 > numero1 && numero2 > numero3) {
			maior = numero2;
		} else {
			maior = numero3;
		}

		System.out.println("O maior número é " + maior);
	}
}
