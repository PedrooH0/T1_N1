package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora da �rea de um tri�ngulo (em metros).");
		System.out.println("Digite o valor da altura do tri�ngulo: ");
		float alt = sc.nextFloat();
		System.out.println("Digite o valor da base do tri�ngulo: ");
		float base = sc.nextFloat();
		float area = (base + alt)/2;
		System.out.println("O valor da �rea desse tri�ngulo � de "+area+" metros quadrados.");

	}

}
