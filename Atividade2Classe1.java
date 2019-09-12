package atividade2;

public class Comparador {

	public String ordenar(int[] vet, int TAM) {
	     int cont1, cont2,aux;
	     int [] result;
         for(cont1 =0; cont1<TAM; cont1++){  
             for(cont2 =0; cont2 <TAM - 1; cont2++){  
                if(vet[cont2]> vet[cont2+1]){  
                     aux = vet[cont2];  
                     vet[cont2] = vet[cont2+1];  
                     vet[cont2+1] = aux;  
                 }
             }
         }
         String resul = "Os dois maiores numeros são <"+vet[8]+"> e <"+vet[7]+">.";
         return resul;
	}
}
