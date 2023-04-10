import java.util.Scanner;

public class NotaLetra {
	public static void main(String[] args) {

		double nota;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		nota = input.nextDouble();

		if (nota >= 9) {
			System.out.println("Nota A");
		} else if (nota >= 7.5 && nota < 9) {
			System.out.println("Nota B");
		} else if (nota >= 6 && nota < 7.5) {
			System.out.println("Nota C");
		} else if (nota >= 4 && nota < 6) {
			System.out.println("Nota D");
		} else {
			System.out.println("Nota F");
		}
	}
}
