package Atividade02Laços;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioIfElse3 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int idade;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia (Importados da biblioteca Scanner)
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();

		if (idade >= 10 && idade <= 14)// Sentença condicional
		{
			System.out.println("\nVocê faz parte da categoria infantil.12");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nVocê faz parte da categoria juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("\nVocê faz parte da categoria adulto.");
		} else {
			System.out.println("\nVocê não faz parte de nenhuma das categorias");
		}

	}

}
