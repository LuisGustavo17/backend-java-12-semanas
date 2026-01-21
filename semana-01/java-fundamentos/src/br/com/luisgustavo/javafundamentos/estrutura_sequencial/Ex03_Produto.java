package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex03_Produto {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("ENTRADA: ");
		a = ed.nextInt();
		b = ed.nextInt();
		c = ed.nextInt();
		d = ed.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENÇA: " + diferenca);
		
	}

}
