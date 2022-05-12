package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioIfElse1 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int a, b, c;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia (Importados da biblioteca Scanner)
		System.out.println("\nEntre com A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com C: ");
		c = leia.nextInt();

		if (a <= b && b <= c)// Sentença condicional
		{
			System.out.println("\nO maior número é: " + c);
		} else if (a <= c && c <= b) {
			System.out.println("\nO maior número é: " + b);
		} else if (b <= c && c <= a) {
			System.out.println("\nO maior número é: " + a);
		} else if (b <= a && a <= c) {
			System.out.println("\nO maior número é: " + c);
		} else if (c <= a && a <= b) {
			System.out.println("\nO maior número é: " + b);
		} else if (c <= b && b <= a) {
			System.out.println("\nO maior número é: " + a);
		}

	}

}
