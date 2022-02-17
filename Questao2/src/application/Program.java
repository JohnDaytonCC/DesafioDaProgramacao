package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);								// Comando para habilitar a entrada de dados via teclado pela variável "input".

		System.out.println("Para cadastrar a sua rede social digite, por favor, o seu nome e senha");
		System.out.print("\nDigite o nome de usuário: ");
		String nome = input.nextLine();										// Guardando o nome passado pelo teclado em uma variável do tipo String

		System.out.println(
				"\nAgora digite uma senha forte.\nPara ser uma senha forte são necessários os seguintes critérios");
		System.out.println("\n* Possuir no mínimo 6 caracteres");
		System.out.println("* Conter no mínimo 1 dígito");
		System.out.println("* Conter no mínimo 1 letra em minúsculo");
		System.out.println("* Conter no mínimo 1 letra em maúscullo");
		System.out.println("* Conter no mínimo 1 carctere especial: !@#$%^&*()-+");

		
		System.out.print("\nDigite a senha: ");
		String senha = input.nextLine();									// Guardando a senha passada pelo teclado em uma variável do tipo String
		
		boolean flag = true;												// Utilização de um indicador para o controle do laço de repetição "while".

		while (flag) {														// Inicialização do laço while
			
			if(senha.length() < 6){											// veridica o tamanho da String, caso tenha menos de 6 caracteres, entrará no if.
				System.out.print("\nSua senha não é considerada forte.\nPor favor acrescente mais " + String.format("%d", (6 - senha.length())) + " caracteres à sua senha.");
				System.out.print("\nDigite a senha: ");
				senha = input.nextLine();									// Guardando a nova senha passada pelo usuário.
			}else {															// Caso a senha tenha 6 ou mais caractere indicará a mensagem de sucesso.
				System.out.println("\nSua senha foi cadastrada com sucesso!");
				flag = false;												// Mudando do valor do indicador para sair do laço de repetição e finalizar o programa.
			}																// Fim do if else
		}																	// Fim do laço while

		input.close();														// fechamento da variável de entrada de dados.
	}

}
