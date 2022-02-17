package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);					// Comando para inclisão de entrada de dados pelo teclado
		
		System.out.print("Por favor digite uma palavra para obter aquantidade de anagrama de pares de String dessa palavra: ");
		String palavra = input.nextLine();						// Recebe os valores passado pelo teclado.
		
		Integer quantidade = quantidadeDeParesDeString(palavra);// Chama a função para determinar a quantidade de pares de String que formam anagramas.
				
		System.out.println("\nEssa palavra contem " + quantidade + " pares de Substring que formam anagramas");
		
		input.close();											// Encerramento da entrada de dados pelo teclado
	}
	
	
	private static int quantidadeDeParesDeString(String nome) {	// Início da função que determina a quantidade de pares de string.
		
		
		char[] vetorNome = nome.toCharArray();					// Convertendo a string em um vetor para facilitar a manipulação
		int quantidade = 0;										// Declaração da variável local que será utilizada para retornar o valor de pares de string
		String acumulador1= new String();						// Declaração da variável que será utilizada para acumular os valor já analizados do primeiro laço for
		String acumulador2 = new String();						// Declaração da variável que será utilizada para acumular os valor já analizados do segundo laço for
		int constante = 1;
		
		for(int i=0; i<vetorNome.length; i++) {					// Início do primeiro laço for

			for(int j=i+1; j<vetorNome.length; j++) {			// Início do segundo laço for
				
				if(acumulador2.indexOf(vetorNome[i])  == -1 && acumulador1.indexOf(vetorNome[j])  == -1) {	// Verifica se o valore de índice "i" está no acumulador2 e se o valor de índice "j" está no acumulador1.
					
					acumulador1 += vetorNome[j];				// Salva o valor no acumulador1 para utilizar como comparação e não repetir a contagem da mesma letra
					quantidade++;								// Incrementa a contagem.
					
				}												// fim do if
			}													// fim do segundo for
			
			acumulador2 += vetorNome[i];						// Salva a String de índice "i" no acumulador para saber se essa letra já foi comparada
			acumulador1 = new String();							// Limpa os valores salvos no acumulador1.
			
		}														// fim do primeiro for
		
		return quantidade; 										// Retorno da quantidade de pares.
		
	}															// fim da função que determina a quantidade dos pares de String que formam anagramas.
	
	
}																// Fim da classe Program
