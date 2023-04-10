import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {

		double base, altura, area;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor da base do retângulo: ");
		base = input.nextDouble();

		System.out.println("Digite o valor da altura do retângulo: ");
		altura = input.nextDouble();

		area = base * altura;

		System.out.println("A área do retângulo é: " + area);
	}
}