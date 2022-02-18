package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 									// Comando para inclusão de entrada de dados pelo teclado

		System.out.print(
				"Por favor digite uma palavra para obter aquantidade de anagrama de pares de String dessa palavra: ");
		String palavra = input.nextLine(); 											// Recebe os valores passados pelo teclado.

		Integer quantidade = quantidadeDeParesDeString(palavra);					// Chama a função para determinar a quantidade de pares de substring que formam anagramas.

		System.out.println("\nEssa palavra contem " + quantidade + " pares de Substring que formam anagramas");

		input.close(); 																// Encerramento da entrada de dados pelo teclado
	}

	private static int quantidadeDeParesDeString(String nome) { 					// Início da função que determina a quantidade de pares de string.

		char[] vetorNome = nome.toCharArray(); 										// Convertendo a string em um vetor para facilitar a manipulação
		int quantidade = 0; 														// Declaração da variável local que será utilizada para retornar o valor de pares de substring
		String acumulador1 = new String(); 											// Declaração da variável que será utilizada para acumular os valores que serão comparados
		String acumulador2 = new String(); 											// Declaração da segunda variável que será utilizada para acumular os valores que serão comparados

		for (int h = 0; h < vetorNome.length - 1; h++) {							/* Início do laço que irá percorrer a String, por exemplo:
																					 * Para uma string "asdfg" iniciará com valor 0 para iniciar a percorrer pelo caractere 'a'
																					 * na outra vez que passar pelo laço iniciará pelo caractere 's' até o caractere 'f'.
																					 */
			
			for (int i = 0; i < vetorNome.length -(1+h); i++) { 					// Início do laço responsável por capturar as substrings e armazenar na variável acumulador1
				
																					/* O seguinte comando irá armazenar as substring na variável acumulador1 da seguinte forma:
																					 * Para uma String "asdfg", por exemplo, iniciará acumulando a seguinte sequência a cada vez que passa pelo laço de repetição
																					 * "a", depois "as", depois "asd" até o penúltimo elemento "asdf".
																					 */
				acumulador1 = nome.substring((0+h),(i+1+h));						
				char[] tempArray1 = acumulador1.toCharArray();						// Armazena a substring da variável acumulador1 em um vetor para facilitar a manipulação
				Arrays.sort(tempArray1);											// Organiza o vetor formado pela substring em ordem alfabética.
				acumulador1 = new String(tempArray1);								// Volta o valor organizado para a forma de String na variável acumulador1
				
				for (int j = 0; j < vetorNome.length - (i+1+h); j++) { 				// Início do laço for que irá armazenar as substring na variável acumulador2 e comparar a igualdade entre as variáveis
	
					acumulador2 = nome.substring((1+j+h), (2+i+j+h));				// Captura substring que será comparada com a variável acumulador1 na variável acumulador2.
					char[] tempArray2 = acumulador2.toCharArray();					// Salva a substring em um vetor
					Arrays.sort(tempArray2);										// Organiza o vetor em ordem alfabética
					acumulador2 = new String(tempArray2);							// Repassa o valor organizado para a variável acumulador2
					
					if (acumulador2.equalsIgnoreCase(acumulador1)) { 				// Verifica se as duas variáveis, acumulador1 e acumulador2, são iguais.
	
						quantidade++; 												// Caso sejam iguais, irá incrementar o contador. 
	
					} 																// fim do if
										
				} 																	// fim do segundo for
			
			}																		// fim do laço for (int h = 0; h < vetorNome.length - 1; h++)

		} 																			// fim do primeiro for

		return quantidade; 															// Retorno da quantidade de pares de substring que são anagramas.
		
	} 																				// fim da função que determina a quantidade dos pares de String que formam anagramas.

} 																					// Fim da classe Program
