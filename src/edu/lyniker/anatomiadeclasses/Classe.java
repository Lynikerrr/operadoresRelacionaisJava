package edu.lyniker.anatomiadeclasses;

public class Classe {
	public static void main(String[] args) {
		System.out.print("Salve rapaziada, sejam bem vindos ");

		/*
		 * Declaração invalida de variaveis: int numero&um = 1; Os unicos simbolos
		 * permitidos são _ e $ int 1numero = 1; // Uma variavel nao pode começar com
		 * numeros // int numero um = 1; // Nao pode ter espaços no nome da variavel //
		 * int long = 1; // Long faz parte das palavras chave da linguagem java //
		 * 
		 * // Declaração correta de variaveis // int numero$um = 1; int numero1 = 1; int
		 * numeroum = 1; int longo = 1;
		 */

		String primeiroNome = "lyniker";
		String segundoNome = "santos";

		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);

	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do metodo= " + primeiroNome.concat(" ").concat(segundoNome);

	}

}