package com.jorge.explorer.dominio;

/**
 * Classe responsavel por modelar o planeta a ser explorado
 * @author Jorge Cassol
 *
 */
public class Planeta {

	//area do planeta a ser explorado
	private Integer altura; 
	private Integer largura;

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
	
}
