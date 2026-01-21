package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex04_Salario {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario; 
		
		System.out.println("ENTRADA: ");
		numeroFuncionario = ed.nextInt();
		horasTrabalhadas = ed.nextInt();
		valorHora = ed.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("SAÍDA: R$ " + salario);
		

	}

}
