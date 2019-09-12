package atividade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int num1, num2;
		String result;
		int TAM = 9;
		Scanner entrada = new Scanner(System.in);
		
		int vet[] = new int[TAM];
		for(int i=0; i<TAM; i++) {
			System.out.printf("Informe o numero %d:", i);
			vet[i] = entrada.nextInt();
		}
		
		
		Comparador comp = new Comparador();
		
		result = comp.ordenar(vet, TAM);
		
		System.out.println(result);
	}
}
