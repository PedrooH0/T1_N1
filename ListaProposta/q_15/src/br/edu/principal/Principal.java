package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-Vindo Jo�o, voc� acaba de receber o seu sal�rio, por�m voc� possui duas contas atrasadas que ainda n�o foram pagas.\n");
		System.out.println("Digite o valor do sal�rio que voc� ganha: ");
		double sal = sc.nextDouble();
		System.out.println("digite o valor da primeira conta pendente: ");
		double conta1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda conta pendente: ");
		double conta2 = sc.nextDouble();
		conta1 = conta1 + (conta1 * 0.02);
	    conta2 = conta2 + (conta2 * 0.02);
	    double contaTl = conta1 + conta2;
	    double restoSal = sal - contaTl;
	    
	    
	    if (restoSal >= 0) {
	    	System.out.println("Jo�o voc� possui um sal�rio total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, voc� conseguir� pagar as duas contas e lhe sobrar� R$ "+restoSal);
	    	
	    }
	
	    else if (restoSal < 0 & sal >= conta1) {
	    	restoSal = restoSal * (-1);
	    	System.out.println("Jo�o voc� possui um sal�rio total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, voc� s� conseguir� pagar uma das duas contas e lhe faltar� R$ "+restoSal+" para pagar a segunda.");
	    }
	
	    else if (restoSal < 0 & sal >= conta2) {
	    	restoSal = restoSal * (-1);
	    	System.out.println("Jo�o voc� possui um sal�rio total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, voc� s� conseguir� pagar uma das duas contas e lhe faltar� R$ "+restoSal+" para pagar a segunda.");
	    }
	    
	    else {
	    	restoSal = restoSal * (-1);
	    	System.out.println("Jo�o voc� n�o conseguir� pagar nehuma das duas contas, faltando R$ "+restoSal+" para pag�-las");
	    }
	    
	    
	    

	}

}
