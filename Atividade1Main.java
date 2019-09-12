
package thirdclass;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int num1, num2, result;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digitar o primeiro valor: \n");
		num1 = entrada.nextInt();
		System.out.println("Digitar o segundo valor: \n");
		num2 = entrada.nextInt();
		
        String menu = "Programa Calculadora\n\n"+
                               "1-Somar\n"+
                               "2-Subtrair\n"+
                               "3-Multiplicar\n"+
                               "4-Dividir\n"+
                               "5-Potência\n";
        
		
        int opcao;
        
        System.out.println("Informe a opção desejada: \n");
		opcao = entrada.nextInt();
		
		Calculadora cal = new Calculadora();
		
        switch (opcao)
        {
        	case 1: 
				result = cal.adicao(num1, num2);
				System.out.println("Adição: \n"+result);
				break;
				
        	case 2:  
             	result = cal.subtracao(num1,  num2);
             	System.out.println("Subtração: \n"+result);
             	break;
             	
        	case 3:  
				result = cal.multiplicacao(num1,  num2);
				System.out.println("Sultiplicação: \n"+result);
				break;
				
        	case 4:  
        		result = cal.divisao(num1,  num2);
        		System.out.println("Divisão: \n"+result);
        		break;
        		
        	case 5:
        		result = cal.potenciacao(num1,  num2);
        		System.out.println("Potenciação: \n"+result);
        		break;

        	default:
        		System.out.println("opção invalida \n");
        		break;
        }
		
	}
}
