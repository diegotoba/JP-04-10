import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {

		double raio, area;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor do raio do círculo: ");
		raio = input.nextDouble();

		area = Math.PI * Math.pow(raio, 2);

		System.out.println("A área do círculo é: " + area);
	}
}