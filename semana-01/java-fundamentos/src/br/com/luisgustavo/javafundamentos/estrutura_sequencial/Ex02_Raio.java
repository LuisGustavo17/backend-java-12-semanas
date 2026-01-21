package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex02_Raio {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		double area, raio;
		double pi = 3.14159;
		
		System.out.println("ENTRADA: ");
		raio = ed.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.println("SAÍDA: " + area);
		
	}

}
