package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area;
		double raio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da �rea de um c�rculo (em metros).");
		System.out.println("Digite o valor do raio desse c�rculo: ");
		raio = sc.nextDouble();
		area = 3.1415 * Math.pow(raio, 2);
		System.out.println("A �rea desse c�rculo ser� de "+area+" metros quadrados.");

	}

}
