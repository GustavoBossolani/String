package br.com.gustavo.banco.tests;

public class TesteString {

	public static void main(String[] args) {

		//String outro = new String("Alura"); = Má prática de programação
		
		//Replace
		String nome = "Mario";
		System.out.println("Nome criado: " + nome);
		
		System.out.println("Executando replace:");
		String novoNome = nome.replace('o', 'a');
		System.out.println(novoNome);
		
		//ToUpperCase e ToLowerCase
		System.out.println("Executando toLowerCase:");
		String novoLower = nome.toLowerCase();
		System.out.println(novoLower);
		
		System.out.println("Executando toUpperCase:");
		String novoUpper = nome.toUpperCase();
		System.out.println(novoUpper);
		
		// chatAt
		System.out.println("Executando charAt:");
		char r = nome.charAt(3);
		System.out.println(r);

		//indexOf
		System.out.println("Executando indexOf:");
		int posicao = nome.indexOf("rio");
		System.out.println(posicao);
		
		//Substring
		System.out.println("Executando substring:");
		String sub = nome.substring(1);
		System.out.println(sub);
		
		//trim
		System.out.println("Executando trim:");
		String nomeNovo = "          Alura            ";
		System.out.println(nomeNovo);
		
		String alura = nomeNovo.trim();
		System.out.println(alura);
		
		//isEmpty
		System.out.println("Executando o isEmpty:");
		String nomeVazio = "";
		if(nomeVazio.isEmpty()) {
			System.out.println("O nome está vazio.");
		}else { System.out.println("O nome não está vazio"); }
		
		//length
		System.out.println("Executando o length");
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//contains
		System.out.println("Executando contaisn:");
		System.out.println("No nome Mario, existe as seguintes letras: ario?");
		if(nome.contains("ario")) {
			System.out.println("Sim possui.");
		}else { System.out.println("Não possui." );}
		
//		//split
//		System.out.println("Executando split:");
//		String boo = "boo";
//		String foo = "foo";
//		int and = 1;
//		
//		String[] newString = boo.split(foo, and);
//		System.out.println(newString);
		 
	}

}
