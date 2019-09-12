// questão 5	
public static void main(String[] argas) {
	Scanner entrada = new Scanner(System.in);
	
	String nome1, nome2;
	System.out.println("Informe o primeiro nome: ");
	nome1 = entrada.nextLine();
	System.out.println("Informe o segundo nome: ");
	nome2 = entrada.nextLine();
	
	char[] nomeArray1 = nome1.toCharArray(); 
	char[] nomeArray2 = nome2.toCharArray();
	
	ComparadorDeString comp = new ComparadorDeString();
	
	boolean result = comp.comparar(nomeArray1, nomeArray2);
	System.out.println(result);
	}
}
