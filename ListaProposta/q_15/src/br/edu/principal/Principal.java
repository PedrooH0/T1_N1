package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-Vindo João, você acaba de receber o seu salário, porém você possui duas contas atrasadas que ainda não foram pagas.\n");
		System.out.println("Digite o valor do salário que você ganha: ");
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
	    	System.out.println("João você possui um salário total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, você conseguirá pagar as duas contas e lhe sobrará R$ "+restoSal);
	    	
	    }
	
	    else if (restoSal < 0 & sal >= conta1) {
	    	restoSal = restoSal * (-1);
	    	System.out.println("João você possui um salário total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, você só conseguirá pagar uma das duas contas e lhe faltará R$ "+restoSal+" para pagar a segunda.");
	    }
	
	    else if (restoSal < 0 & sal >= conta2) {
	    	restoSal = restoSal * (-1);
	    	System.out.println("João você possui um salário total de R$ "+sal+" e tem que pagar duas contas num total de R$ "+contaTl+" com juros.\nCom isso, você só conseguirá pagar uma das duas contas e lhe faltará R$ "+restoSal+" para pagar a segunda.");
	    }
	    
	    else {
	    	restoSal = restoSal * (-1);
	    	System.out.println("João você não conseguirá pagar nehuma das duas contas, faltando R$ "+restoSal+" para pagá-las");
	    }
	    
	    
	    

	}

}
