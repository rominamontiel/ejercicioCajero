package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	//VERSION 1
	@Test
	public void crearCuentaVacia() {
		Cuenta cuentaObjeto =  new Cuenta(0.0);
		Double esperado = 0.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
		
	}
	
	//VERSION 2
	@Test
	public void crearCuentaVaciaV2(){
		Cuenta cuentaObjeto = new Cuenta();
		Double esperado = 0.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
	}

	@Test
	public void crearCuentaConSaldo(){
		Cuenta cuentaObjeto = new Cuenta (100.0);
		Double esperado = 100.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
				
	}
	
	//VERSION 1 - Constructor 2
	@Test
	public void ingresarDinero(){
		Cuenta cuentaObjeto = new Cuenta();
		Double importe = 300.0;
		cuentaObjeto.depositar(importe);
		assertEquals(importe,cuentaObjeto.estadoDeSaldoGet());
				
	}
	
	//VERSION 2 - Constructor 1
	@Test
	public void ingresarDineroV2(){
		Cuenta cuentaObjeto = new Cuenta(50.0);
		cuentaObjeto.depositar(150.0);
		Double esperado = 200.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
				
	}
	
	@Test
	public void extraerDinero(){
		Cuenta cuentaObjeto = new Cuenta(1200.0);
		cuentaObjeto.extraer(500.0);
		Double esperado = 700.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
	
			
	}
	
	@Test 
	public void extraccionInvalida(){
		Cuenta cuentaObjeto = new Cuenta(500.0);
		cuentaObjeto.extraer(800.0);
		Double esperado=500.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
		
	}
	
	@Test
	public void consultarSaldo(){
		Cuenta cuentaObjeto = new Cuenta(1500.0);
		Double esperado = 1500.0;
		assertEquals(esperado,cuentaObjeto.estadoDeSaldoGet());
		
		System.out.printf("El saldo de su cuenta es: %s ",cuentaObjeto.estadoDeSaldoGet() );
	}
	
	//VERSION 2 DE EXTRAER **
	
	@Test
	public void estraccionInvalidaV2(){
		Cuenta cuentaObjeto = new Cuenta(200.0);
		Double esperado=0.0;
		assertEquals(esperado,cuentaObjeto.extraerDinero(300.0));
		
	}
	
}
