package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);					// Comando para habilitar a entrada de dados via teclado.
		
																// Instruções para informar o usuário a função do programa
		System.out.println("Este programa fonecerá a imagem de uma escada de N degraus, onde \nesse valor N será informado pelo usuário. ");
		System.out.println();
		
		System.out.print("Por favor digite um valor inteiro de N: ");
		int n = input.nextInt();
		
		System.out.println();									// Espaço para separar a pergunta do resultado.
		
		String degrau = "";										// Variável utilizada para armazenar os caracteres que representarão os degraus.
		
		for(int i = 1; i <= n; i++) {							// Laço que determina a quantidade de linas ou degraus da escada
			
			for(int j=1; j<=(n-i); j++) {						// Laço que determina a quantidade do caractere espaço em cada linha
				degrau = degrau + " ";							// Inclução da quantidade de vezes que o caractere espaço será utilizado em cada linha
			}													// Final do laço que determina a quantidade do caractere espaço em cada linha
			
			for(int k=1; k<=i; k++) {							// Laço que determina a quantidade do caractere asterisco em cada linha
				degrau = degrau + "*";							// Inclução da quantidade de vezes que o caractere asterisco será utilizado em cada linha
			}													// Final do laço que determina a quantidade do caractere asterisco em cada linha
			
			System.out.println(degrau);							// Comando para imprimir na tela cada degrau

			degrau = "";										// Limpando a variável
		}														// Fim do laço for(int i = 1; i <= n; i++)
		input.close();											// Encerramento da entrada de dados pelo teclado
	}

}																// Fim da classe Program
