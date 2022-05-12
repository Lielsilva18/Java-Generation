package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioFor2 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int x;

		Scanner leia = new Scanner(System.in);

		// Criação dos 3 argumentos
		for (x = 1000; x <= 1999; x++) {
			if (x % 11 == 5)// Sentença condicional
			{
				System.out.println("\nO resultado:" + x);// resultado...
			}

		}

	}

}
