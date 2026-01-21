package br.com.luisgustavo.javafundamentos.estrutura_condicional;

import java.util.Scanner;

public class Ex02_Par {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int n;
		
		System.out.println("ENTRADA: ");
		n = ed.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		

	}

}
