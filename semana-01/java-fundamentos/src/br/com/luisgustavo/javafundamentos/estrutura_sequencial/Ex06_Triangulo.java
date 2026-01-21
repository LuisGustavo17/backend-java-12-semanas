package br.com.luisgustavo.javafundamentos.estrutura_sequencial;

import java.util.Scanner;

public class Ex06_Triangulo {

	public static void main(String[] args) {
		
		/*Refazer a formula da area do triangulo e trapezio*/
		
		Scanner ed = new Scanner(System.in);
		
		double areaCirculo, pi = 3.14;
		float a, b, c;
		float areaTriangulo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("ENTRADA: ");
		
		a = ed.nextFloat();
		b = ed.nextFloat();
		c = ed.nextFloat();
		
		areaTriangulo = a * c;
		areaCirculo = pi *(c * c);
		areaTrapezio = a * b * c;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: " + areaTriangulo);
		System.out.println(" ");
		System.out.printf("CIRCULO: " + areaCirculo);
		System.out.println(" ");
		System.out.printf("TRAPEZIO: " + areaTrapezio);
		System.out.println(" ");
		System.out.printf("QUADRADO: " + areaQuadrado);
		System.out.println(" ");
		System.out.printf("RETANGULO: " + areaRetangulo);
		
		

	}

}
