package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioDoWhile1 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia (Importados da biblioteca Scanner)
		System.out.println("\nEntre com um número");
		num = leia.nextInt();

		do {
			soma += num;
			System.out.println("\nEntre com um número");
			num = leia.nextInt();
		} while (num != 0);
		System.out.println("\nA soma é: " + soma);// resultado...

	}

}
