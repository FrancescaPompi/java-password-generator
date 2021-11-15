package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		// dichiaro le variabili e assegno i valori
		String nome = "Francesca";
		String cognome = "Pompi";
		String colorePreferito = "blu";
		int giorno = 24;
		int mese = 3;
		int anno = 1993;
		int risultato = giorno + mese + anno;
		
		
		System.out.print("La password dell'utente Francesca Pompi è: ");
		System.out.print(nome + "-");
		System.out.print(cognome + "-");
		System.out.print(colorePreferito + "-");
		System.out.print(risultato);
		
	}

}
