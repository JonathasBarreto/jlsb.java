package Q4;
import java.lang.Math;

public class Estatistica { //classe estatistica
	public int maiorValor;
	//classe chamada medidas
	
	public Estatistica(int maiorValor)
	{
		if(maiorValor >= 0) {
			this.maiorValor = maiorValor;//atribuindo a um atributo
		}else {
			System.out.println("valor invalido");
		}		
	}
	
	//Método construtor sem parametros
	public Estatistica() {
	}

	public int getmaiorValor() {
		return this.maiorValor;
	}

	public void setmaiorValor(int maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	
	
	

	public int somatorio(Estatistica est) {
		int som = 0;
		int i = 0;
		int a = 0;
		do{// laço do while
			a++;
			som = som + a;
			i++;
		}while(i < est.getmaiorValor());
		return som;//classe que retorna somatorio

	}

	public double media(Estatistica est, double som) {
		double med = 0;
		med = som/est.getmaiorValor();
		return med;//classe que retorna média

	}

	public double variancia(Estatistica est, double med) {
		double var = 0;
		int a = 0;
		double fir = 0;
		for(int i = 0; i < est.getmaiorValor(); i++) {//laço for
			a++;
			fir = fir + Math.pow((a - med),2);
		}
		var = fir/(est.getmaiorValor() - 1);
		return var;//classe que retorna variancia

	}
	public void mostrar(Estatistica est, int som, double med, double var) {
		System.out.println("O somatório é: "+som);
		System.out.println("A média é: "+med);
		System.out.println("A variancia é: "+var);
		
	}//classe para mostrar resultado

	public void paridade(Estatistica est) {
		int i = 0;
		while(i < est.getmaiorValor()) {// laço while
			if(i % 2 == 0) {
				System.out.println(i+" é par");
			}
			else{
				System.out.println(i+" é impar");
			}
			i++;
		}//classe para mostrar na tela se é par ou impar
	}
}
