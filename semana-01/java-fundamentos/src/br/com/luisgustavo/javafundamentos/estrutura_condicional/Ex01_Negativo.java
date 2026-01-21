package br.com.luisgustavo.javafundamentos.estrutura_condicional;

import java.util.Scanner;

public class Ex01_Negativo {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int n;
		
		System.out.println("ENTRADA: ");
		n = ed.nextInt();
		
		if(n >= 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}

	}

}
