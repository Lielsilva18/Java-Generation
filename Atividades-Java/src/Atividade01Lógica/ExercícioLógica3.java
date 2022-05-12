package Atividade01Lógica;

//Importação da biblioteca Scanner
import java.util.Scanner;

public class ExercícioLógica3 {

	public static void main(String[] args) {

		// Declaração da variáveis
		int totalSeg, horas, min, segundos;

		Scanner leia = new Scanner(System.in);

		// Declaração dos comandos escreva e leia(Importados da biblioteca Scanner)
		System.out.println("\nQuantidade de segundos que durou o evento: ");
		totalSeg = leia.nextInt();

		// equação do problema usando o resto(Módulo %)
		horas = totalSeg / 3600;
		min = (totalSeg % 3600) / 60;
		segundos = (totalSeg % 3600) % 60;

		System.out.println("\nO evento durou : " + horas + "h : " + min + "m : " + segundos + "s.");// resultado...

	}

}
