package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ol� trabalhador, o seu chefe acaba de te dar um aumento de 25% no seu s�lario, que tal deescobrir quanto voc� ganha agora?");
		System.out.println("Digite o seu sal�rio atual: ");
		float sal = sc.nextFloat();
		float novoSal = (float) (sal + (sal * 0.25));
		System.out.println("O seu novo s�lario ser� de "+novoSal);

	}

}
