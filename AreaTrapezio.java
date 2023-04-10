import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {

		double baseMaior, baseMenor, altura, area;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor da base maior do trapézio: ");
		baseMaior = input.nextDouble();

		System.out.println("Digite o valor da base menor do trapézio: ");
		baseMenor = input.nextDouble();

		System.out.println("Digite o valor da altura do trapézio: ");
		altura = input.nextDouble();

		area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.println("A área do trapézio é: " + area);
	}
}
