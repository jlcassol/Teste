package com.jorge.explorer.dominio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe responsavel por modelar o planeta a ser explorado
 * @author Jorge Cassol
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Planeta {

	//area do planeta a ser explorado
	private Integer altura; 
	private Integer largura;

	public Planeta() {
	}

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
