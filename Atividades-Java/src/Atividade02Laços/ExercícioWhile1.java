package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioWhile1 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int idade = 0, genero, fp, contpc = 0, contmn = 0, contha = 0, contnbc = 0, contpn40 = 0, contpc18 = 0, x = 1;

		Scanner leia = new Scanner(System.in);

		while (x <= 150) {
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();

			System.out.println("\nEntre com seu gênero: \n1-Feminino\n2-Masculino\n3-Não binário\n");
			genero = leia.nextInt();
			while (genero < 1 || genero > 3) {
				System.out.println("\nGênero inválido...Entre com sua gênero: ");
				genero = leia.nextInt();
			}
			System.out.println(
					"\nEntre com seu fator psicológico: \n1-Pessoa Calma\n2-Pessoa Nevorsa\n3-Pessoa Agressiva");
			fp = leia.nextInt();
			while (fp < 1 || fp > 3) {
				System.out.println("\nFator Psicológico inválido...Entre com sua fator psicológico: ");
				fp = leia.nextInt();
			}
			if (fp == 1)// Sentença condicional
			{
				contpc++;
			}
			if (genero == 1 && fp == 2) {
				contmn++;
			}
			if (genero == 2 && fp == 3) {
				contha++;
			}
			if (genero == 3 && fp == 1) {
				contnbc++;
			}
			if (fp == 2 && idade > 40) {
				contpn40++;
			}
			if (fp == 1 && idade < 18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: " + contpc);
		System.out.println("\nQuantidade de mulheres nervosas: " + contmn);
		System.out.println("\nQuantidade de homens agressivos: " + contha);
		System.out.println("\nQuantidade de não binários calmos: " + contnbc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: " + contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: " + contpc18);// Impressão para o
																								// usuário

	}

}
