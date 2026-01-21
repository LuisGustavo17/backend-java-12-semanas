package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex01_Soma {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Entrada: ");
		n1 = ed.nextInt();
		n2 = ed.nextInt();
		
		System.out.println("Soma: " + (n1+n2));
		

	}

}
