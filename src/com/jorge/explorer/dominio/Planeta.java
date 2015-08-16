package com.jorge.explorer.dominio;

import java.util.List;

/**
 * Classe responsavel por modelar o planeta a ser explorado
 * @author Jorge Cassol
 *
 */
public class Planeta {

	//area do planeta a ser explorado
	private Integer altura; 
	private Integer largura;
	private List<Sonda> sondas;

	public Planeta(Integer altura, Integer largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public Integer getAltura() {
		return altura;
	}

	public Integer getLargura() {
		return largura;
	}

	public List<Sonda> getSondas() {
		return sondas;
	}

	public void setSondas(List<Sonda> sondas) {
		this.sondas = sondas;
	}
	
}
