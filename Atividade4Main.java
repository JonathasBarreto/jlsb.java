package Q4;
import Q4.Estatistica;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = entrada.nextInt();// lendo numero
		
		Estatistica est = new Estatistica(num);//passando numero para classe
		est.somatorio(est);
		est.media(est,est.somatorio(est));
		est.variancia(est, est.media(est,est.somatorio(est)));
		est.paridade(est);
		est.mostrar(est,est.somatorio(est),est.media(est,est.somatorio(est)),est.variancia(est, est.media(est,est.somatorio(est))));
	}

}
