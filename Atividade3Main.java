package Q3;
import Q3.Medidas;
import Q3.ConversorDeMedidas;
public class Q3 {

	public static void main(String[] args) {
		Medidas med = new Medidas("KM", 20, "KG", 20, "C", 20);
		ConversorDeMedidas conv = new ConversorDeMedidas();
		conv.converterDistancia(med);
		conv.converterMassa(med);
		conv.converterTemperatura(med);

	}
}
