package br.edu.principal;
import java.util.Scanner;
public class Principal7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guia do sal�rio de um trabalhador ordin�rio.\n");
		System.out.println("Digite a quantidade de horas trabalhadas?: (somente valores inteiros)");
		int horas = sc.nextInt();
		System.out.println("Digite o valor do seu sal�rio: ");
		double salMin = sc.nextDouble();
		System.out.println("Digite a quantidade de horas extras trabalhadas: (somente valores inteiros)");
		int horasExtras = sc.nextInt();
		double horaVal = 1/8 * salMin;
		double horaExVal = 1/4 * salMin;
		double salBruto = horas * horaVal;
		double quantHoraExVal = horasExtras * horaExVal;
		double salReceber = salBruto + quantHoraExVal;
		System.out.println("O sal�rio que voc� receber� ser� de R$ "+salReceber);
		
		

	}

}
