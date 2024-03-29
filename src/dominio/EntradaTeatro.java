package dominio;

import java.math.BigDecimal;

import interfaces.ICosto;

public class EntradaTeatro extends Entrada implements ICosto{
// se declaran la variables 
	int genero;
	final double valorFijo = 1350.50;

	public EntradaTeatro() {	}
	public EntradaTeatro(int genero) {
		super();
		this.genero = genero;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
		
	}

	public double getValorFijo() {
		return valorFijo;
	}
	
	public String obtenerGenero(int genero) {
		String tipoGenero = null;
		if(genero == 1) {
			tipoGenero ="Drama";
			return tipoGenero;
			
		}else if (genero == 2) {
			tipoGenero = "Teatro";
			return tipoGenero;
			
		}else if (genero == 3) {
			tipoGenero = "Comedia";
			return tipoGenero;
		}
		return tipoGenero;
	}
	
	@Override
	public void calcularCosto(String tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularCostoTotal(String tipoEntrada) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(int genero) {
		return "EntradaTeatro [genero=" + obtenerGenero(genero) + ", valorFijo=" + valorFijo + "]";
	}
	
}
