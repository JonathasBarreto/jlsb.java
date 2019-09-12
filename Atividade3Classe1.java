package Q3;

public class Medidas {
	//classe chamada medidas
	public String unidadeDeDistancia;
	public double distancia;
	public String unidadeDeMassa;
	public double massa;
	public String unidadeDeTemperatura;
	public int temperatura;
	
	//Método construtor que recebe as 6 medidas e métodos sets e gets
	public Medidas(String unidadeDeDistancia, double distancia, String unidadeDeMassa, double massa, String unidadeDeTemperatura, int temperatura)
	{
		if(unidadeDeDistancia.equalsIgnoreCase("KM") || unidadeDeDistancia.equalsIgnoreCase("MI")) 
		{
			
			this.unidadeDeDistancia = unidadeDeDistancia;	
			
		}else{
			
			System.out.println("erro na unidade de distancia");
			this.unidadeDeDistancia = "KM";
			
		}
		
		this.distancia = distancia;
		
		if(unidadeDeMassa.equalsIgnoreCase("KG") || unidadeDeMassa.equalsIgnoreCase("LB")) 
		{
			
			this.unidadeDeMassa = unidadeDeMassa;
			
		}else{	
			
			System.out.println("erro na unidade de massa");
			this.unidadeDeMassa = "KG";
			
		}
		
		this.massa = massa;
		
		if(unidadeDeTemperatura.equalsIgnoreCase("C") || unidadeDeTemperatura.equalsIgnoreCase("F")) 
		{
			
			this.unidadeDeTemperatura = unidadeDeTemperatura;
			
		}else {
			
			System.out.println("erro na unidade de temperatura");
			this.unidadeDeTemperatura = unidadeDeTemperatura;
			
		}

		this.temperatura = temperatura;
	}
	
	//Método construtor sem parametros
	public Medidas() {
	}

	public String getunidadeDeDistancia() {
		return this.unidadeDeDistancia;
	}

	public void setunidadeDeDistancia(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}

	public double getdistancia() {
		return this.distancia;
	}

	public void setdistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getunidadeDeMassa() {
		return this.unidadeDeMassa;
	}

	public void setunidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}

	public double getmassa() {
		return this.massa;
	}

	public void setmassa(int massa) {
		this.massa = massa;
	}

	public String getunidadeDeTemperatura() {
		return this.unidadeDeTemperatura;
	}

	public void setunidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}

	public int gettemperatura() {
		return this.temperatura;
	}

	public void settemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
}
