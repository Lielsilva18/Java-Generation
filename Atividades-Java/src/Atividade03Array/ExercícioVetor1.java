package Atividade03Array;

public class ExercícioVetor1 {

	public static void main(String[] args) {
		
		//Declaração da variáveis
		int num[] = { 1, 0, 5, -2, -5, 7 };
		int x, soma;

		soma = num[0] + num[1] + num[5];
		System.out.println("\nA soma é: " + soma);

		num[4] = 100;
			
			//Criação dos 3 argumentos
		for (x = 0; x < num.length; x++) {
			System.out.println("\nVetor num: \n" + num[x]);
		}

	}

}
