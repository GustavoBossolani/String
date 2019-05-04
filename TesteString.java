package br.com.gustavo.banco.tests;

public class TesteString {

	public static void main(String[] args) {
		
		
		/**
		 * Classe criada para ajudar no entendimento de m�todos fundamentais da Classe String
		 * 
		 * :)
		 * 
		 * @author  Gustavo Bossolani 
		 */
		

		// String outro = new String("Alura"); = � considerado m� pr�tica de programa��o pois consome mais mem�ria
		// mais detalhes no link: https://pt.stackoverflow.com/questions/19098/desempenho-na-cria��o-de-strings-em-java

		String nome = "Mario";
		System.out.println("Nome criado: " + nome);

		// Replace
		// Troca uma letra por outra (o, a) - char: 'o' por 'a'
		System.out.println("Executando replace:");
		String novoNome = nome.replace('o', 'a');
		System.out.println(novoNome);

		// ToUpperCase e ToLowerCase
		// Converte a String para LowerCase ou UpperCase (UPPERCASE) - (lowercase)
		System.out.println("Executando toLowerCase:");
		String novoLower = nome.toLowerCase();
		System.out.println(novoLower);

		System.out.println("Executando toUpperCase:");
		String novoUpper = nome.toUpperCase();
		System.out.println(novoUpper);

		// chatAt
		// Retorna o char na posi��o n - posi��o come�a em 0 assim como nos Arrays
		System.out.println("Executando charAt:");
		char r = nome.charAt(3);
		System.out.println(r);

		// indexOf
		/*
		 * Retorna a posi��o de um caracter encontrado dentro de uma String Uma
		 * sequencia de String tamb�m pode ser usado como parametro Caso n�o seja
		 * encontrado um caracter ou uma sequencia � retornado -1 Existe o lastIndexOf()
		 * que devolve a ultima posi��o que o caracter ou sequencia foi encontrado
		 */
		System.out.println("Executando indexOf:");
		int posicao = nome.indexOf("rio");
		System.out.println(posicao);

		// Substring
		/*
		 * String.Substring(int i) retorna uma Substring que se inicia no valor i
		 * String.Substring(int begin, int end) retorna uma Substring que se inicia no
		 * valor begin e termina no valor end
		 */
		System.out.println("Executando substring:");
		String sub = nome.substring(1);
		System.out.println(sub);

		// trim
		// trim() Retorna uma c�pia da string, com espa�os em branco iniciais e finais
		// omitidos.
		System.out.println("Executando trim:");
		String nomeNovo = "          Alura            ";
		System.out.println(nomeNovo);

		String alura = nomeNovo.trim();
		System.out.println(alura);

		// isEmpty
		// Verifica se a String est� vazia
		System.out.println("Executando o isEmpty:");
		String nomeVazio = "";
		if (nomeVazio.isEmpty()) {
			System.out.println("O nome est� vazio.");
		} else {
			System.out.println("O nome n�o est� vazio");
		}

		// length
		// Retorna o tamanho da String assim como o .size() das collections
		System.out.println("Executando o length");
		System.out.println("O nome M�rio possui: " + nome.length() + " letras");
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		// contains
		// Verifica se um unico char ou uma sequencia de char se encontram em uma String
		System.out.println("Executando contains:");
		System.out.println("No nome Mario, existe as seguintes letras: ario?");
		if (nome.contains("ario")) {
			System.out.println("Sim possui.");
		} else {System.out.println("N�o possui.");}

		// split
		/*
		 * Separa uma String retornando um vetor; O crit�rio de separa��o pode ser tanto
		 * um char quanto uma palavra completa; O segundo parametro � a quantidade de
		 * "peda�os" que voc� deseja separar a String; Caso essa quantidade de peda�os
		 * for alcan�adas a String n�o ser� mais separada
		 */
		System.out.println("Executando split:");
		String nomeCompleto = "Gustavo de Oliveira Bossolani";
		String[] split = nomeCompleto.split(" ", 3);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

	}

}
