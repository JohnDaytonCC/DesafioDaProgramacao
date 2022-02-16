package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Comando para habilitar a entrada de dados via teclado.
		Scanner input = new Scanner(System.in);
		
		// Instruções para informar o usuário a função do programa
		System.out.println("Este programa fonecerá a imagem de uma escada de N degraus, onde \nesse valor N será informado pelo usuário. ");
		System.out.println();
		
		System.out.print("Por favor digite um valor inteiro de N: ");
		int n = input.nextInt();
		
		// Espaço para separar a pergunta do resultado.
		System.out.println();
		
		// Variável utilizada para armazenar os caracteres que representarão os degraus.
		String degrau = "";
		
		for(int i = 1; i <= n; i++) {
			for(int j=1; j<=(n-i); j++) {
				degrau = degrau + " ";
			}
			for(int k=1; k<=i; k++) {
				degrau = degrau + "*";
			}
			
			// Comando para imprimir na tela cada degrau
			System.out.println(degrau);
			
			// Limpando a variável
			degrau = "";
		}
		input.close();
	}

}
