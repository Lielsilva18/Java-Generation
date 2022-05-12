package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioFor1 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int x, num, quantPar = 0, quantImpar = 0;

		Scanner leia = new Scanner(System.in);

		// Criação dos 3 argumentos
		for (x = 1; x <= 10; x++) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		System.out.println("\nQuantidade de números pares: " + quantPar);
		System.out.println("\nQuantidade de números impares: " + quantImpar);// resultado...

	}

}
