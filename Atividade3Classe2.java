//questão 3
package Q3;
import Q3.Medidas;
import java.lang.Math;
import java.text.DecimalFormat;

 // importar a classe de medida

public class ConversorDeMedidas {

	Medidas med = new Medidas();
	DecimalFormat formatador = new DecimalFormat("0.00");

	public void converterMassa(Medidas med) {
		
		double lb = 0;
		double kg = 0;
		if(med.getunidadeDeMassa().equalsIgnoreCase("KG")) {
			lb = med.getmassa() * 2.2046;
			System.out.println(formatador.format(lb) + " LB.");
		}else {
			kg = med.getmassa() / 2.2046;
			System.out.println(formatador.format(kg) + " KG.");
		}
	}
	
	public void converterTemperatura(Medidas med) {
		
		double F = 0;
		double C = 0;
		if(med.getunidadeDeTemperatura().equalsIgnoreCase("C")) {
			F = med.gettemperatura() * 1.8 + 32; // passar para set
			int resultF = (int) Math.round(F);
			System.out.println(resultF +" F.");
		}else {
			C = (med.gettemperatura() - 32) / 1.8;
			int resultC = (int) Math.round(C);
			System.out.print(resultC +" C.");
		}
	}
	
	public void converterDistancia(Medidas med) {
		double KM = 0;
		double MI = 0;
		if(med.getunidadeDeDistancia().equalsIgnoreCase("KM")) {
			MI = med.getdistancia() / 1.609;
			System.out.println(formatador.format(MI) + " MI.");

		}else {
			KM = med.getdistancia() * 1.609;
			System.out.println(formatador.format(KM) + " KM.");
		}
	}

}
