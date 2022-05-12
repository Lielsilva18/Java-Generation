package Atividade01Lógica;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioLógica2 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int Totaldias, Anos, Meses, Dias;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia(Importados da biblioteca Scanner)
		System.out.println("\nQuantidade de dias que tem a idade: ");
		Totaldias = leia.nextInt();

		// equação do problema usando o resto (Módulo %)
		Anos = Totaldias / 365;
		Meses = (Totaldias % 365) / 30;
		Dias = (Totaldias % 365) % 30;

		System.out.println("\nAnos: " + Anos + "\nMeses: " + Meses + "\nDias: " + Dias);// resultado...

	}

}
