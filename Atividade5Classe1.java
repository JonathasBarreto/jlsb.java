package ade;

public class ComparadorDeString {
	
	public boolean comparar(char[] vet1, char[] vet2) {
		int i;
		int f;
		int TAM1 = vet1.length;
		int TAM2 = vet2.length;
		if(TAM1 == TAM2) {
			for(i = 0; i < TAM1; i++) {
				for(f = TAM1 - 1; f >= 0; f--) {
					if(vet1[i] == vet2[f]) {
						return true;
					}else {
						return false;
					}
				}
			}
		}else {
			return false;
		}
		return false;
		
	}

}
