package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu sal�rio atual: ");
		float sal = sc.nextFloat();
		float imp = (float) (sal * 0.10);
		float salReceber = (float) (sal + 50 - imp);
		System.out.println("O seu s�lario ser� de "+salReceber);

	}

}
