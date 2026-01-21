package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex05_Peca {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valorPeca1,valorPeca2, valorTotal;
		
		System.out.println("ENTRADA: ");
		codPeca1 = ed.nextInt();
		numPeca1 = ed.nextInt();
		valorPeca1 = ed.nextDouble();
		
		codPeca2 = ed.nextInt();
		numPeca2 = ed.nextInt();
		valorPeca2 = ed.nextDouble();
		
		valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2); 
		
		System.out.println("VALOR A PAGAR: R$ " + valorTotal);
		
		
		
	}

}
