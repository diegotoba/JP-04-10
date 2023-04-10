import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) throws Exception {
    /*
     * System.out.println("Hello World!");
     * 
     * Integer a, b, c;
     * a = 1;
     * b = 2;
     * c = a + b;
     * System.out.println("resultado da soma: " + c);
     * 
     * String teste = new String("teste");
     * String teste2 = new String();
     * teste2 = "valor";
     * 
     * System.out.println(teste);
     * System.out.println(teste2);
     * 
     * BigDecimal casasDecimais = new BigDecimal(10.20);
     * System.out.println(casasDecimais);
     * 
     * int inteiroPrimitivo = 1;
     * 
     * double valor;
     * valor = 1.0;
     * 
     * // char charPrimitivo = 'teste';
     * 
     * boolean isBoolean = true;
     * 
     * Scanner input = new Scanner(System.in);
     * 
     * int int1, int2, int3;
     * 
     * System.out.println("digite o numero");
     * int1 = input.nextInt();
     * 
     * System.out.println("digite o outro numero");
     * int2 = input.nextInt();
     * 
     * int3 = int1 + int2;
     * System.out.println("soma: " + int3);
     */

    /*
     * int numeroAlunos, contador = 1;
     * double nota, media = 0;
     * 
     * Scanner input = new Scanner(System.in);
     * 
     * System.out.println("digite o numero de alunos");
     * numeroAlunos = input.nextInt();
     * 
     * while (contador <= numeroAlunos) {
     * System.out.println("digite a nota do aluno" + contador);
     * 
     * nota = input.nextDouble();
     * media += nota;
     * contador++;
     * 
     * }
     * media /= numeroAlunos;
     * System.out.println("a media da turma é " + media);
     */

    Map<String, String> mapa = new HashMap<>();
    mapa.put("chave1", "valor1");
    mapa.put("chave2", "valor2");
    mapa.put("chave3", "valor3");

    String valorChave1 = mapa.get("chave1");
    System.out.println("o valor da chave 1 é: " + valorChave1);

    mapa.put("chave2", "novoValor");

    System.out.println("o valor da chave 2 é: " + mapa.get("chave2"));

    for (String chave : mapa.keySet()) {
      String valor = mapa.get(chave);
      System.out.println(chave + " " + valor);
    }
  }
}