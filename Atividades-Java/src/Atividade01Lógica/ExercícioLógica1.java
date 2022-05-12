package Atividade01Lógica;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioLógica1 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int Anos, Meses, Dias, Resultado;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia(Importados da biblioteca Scanner)
		System.out.println("\nInsira sua idade");
		System.out.println("\nAnos: ");
		Anos = leia.nextInt();
		System.out.println("\nMeses: ");
		Meses = leia.nextInt();
		System.out.println("\nDias: ");
		Dias = leia.nextInt();
		Resultado = (Anos * 365) + (Meses * 30) + Dias;
		System.out.println("\nResultado: " + Resultado + " 18dias");// resultado...

	}

}
