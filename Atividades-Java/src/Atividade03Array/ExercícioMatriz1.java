package Atividade03Array;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioMatriz1 {

	public static void main(String[] args) {

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];

		// Declaração da variáveis
		float numero;
		int i, j;
		int op;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 2; i++) { // Criação dos 3 argumentos
			for (j = 0; j < 2; j++) {
				System.out.println("\nEntre com os valores da matriz1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com os valores da matriz1: ");
				matriz2[i][j] = leia.nextFloat();
			}
		}
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda matriz");
			System.out.println("\n3- Adicionar uma variável as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1: {
				for (i = 0; i < 2; i++) {
					for (j = 0; j < 2; j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma das matrizes: " + matriz3[i][j]);
					}
				}
			}
				break;
			case 2: {
				for (i = 0; i < 2; i++) {
					for (j = 0; j < 2; j++) {
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nSubtração das matrizes: " + matriz3[i][j]);
					}
				}
			}
				break;
			case 3: {
				System.out.println("\nInsira o valor do número: ");
				numero = leia.nextFloat();
				for (i = 0; i < 2; i++) {
					for (j = 0; j < 2; j++) {
						matriz1[i][j] += numero;
						matriz2[i][j] += numero;
						System.out.println("\nValor da matriz 1 " + matriz1[i][j]);
						System.out.println("\nValor da matriz 2 " + matriz2[i][j]);
					}
				}
			}
				break;
			case 4: {
				for (i = 0; i < 2; i++) {
					for (j = 0; j < 2; j++) {
						System.out.println("\nValor da matriz 1 " + matriz1[i][j]);
						System.out.println("\nValor da matriz 2 " + matriz2[i][j]);
					}
				}
			}
				break;
			case 0: {
				System.out.println("\nMuito obrigado por utilizar nosso programa!");
			}
				break;
			default: {
				System.out.println("\nOpção Inválida!");
			}
			}

		} while (op != 0);

	}

}
