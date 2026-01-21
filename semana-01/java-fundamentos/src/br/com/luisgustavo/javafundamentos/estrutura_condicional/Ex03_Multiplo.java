package br.com.luisgustavo.javafundamentos.estrutura_condicional;

import java.util.Scanner;

public class Ex03_Multiplo {

	public static void main(String[] args) {
		/*Refatorar o código*/
		Scanner ed = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("ENTRADA: ");
		a = ed.nextInt();
		b = ed.nextInt();
		
		if(a%b == 0 || b%0 == 0) {
			System.out.println("São Multiplos");
	}else {
		System.out.println("Não são Multiplos");
	}

}
}