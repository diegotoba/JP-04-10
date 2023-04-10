import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {

		double base, altura, area;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor da base do triângulo: ");
		base = input.nextDouble();

		System.out.println("Digite o valor da altura do triângulo: ");
		altura = input.nextDouble();

		area = (base * altura) / 2;

		System.out.println("A área do triângulo é: " + area);
	}
}
