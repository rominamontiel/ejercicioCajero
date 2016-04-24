package ar.edu.unlam.basica2;

public class Cuenta {
	private Double saldo;
	
	public Cuenta(Double importe){      // Constructor 1
		this.saldo=importe;
	}
	
	public Cuenta(){        // Constructor 2
		this.saldo=0.0;
	}
	public void depositar (Double importe){
		this.saldo += importe;
	}
	
	public void extraer (Double importe){
		if(importe <= this.saldo)
			this.saldo -= importe;
	}
	
	public Double estadoDeSaldoGet(){
		return this.saldo;
	}
	
	// VERSION 2 DE EXTRAER **
	
	public Double extraerDinero (Double importeARetirar){
		Double importeRetirado;
		if(importeARetirar<=this.saldo)
		{this.saldo-=importeARetirar;
		importeRetirado=importeARetirar;}
		else
		importeRetirado=0.0;
		
		return importeRetirado;
					
	}
	
}
