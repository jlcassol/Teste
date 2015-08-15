package com.jorge.explorer.dominio;

import java.util.List;

/**
 * Classe responsavel por modelar o planeta a ser explorado
 * @author Jorge Cassol
 *
 */
public class Planeta {

	//area do planeta a ser explorado
	private Integer[][] areaPlaneta; 
	private List<Sonda> sondas;

	public Planeta(Integer altura, Integer largura) {
		areaPlaneta = new Integer[altura][largura];
	}
	
	public Integer[][] getAreaPlaneta() {
		return areaPlaneta;
	}

	public void setAreaPlaneta(Integer[][] areaPlaneta) {
		this.areaPlaneta = areaPlaneta;
	}

	public List<Sonda> getSondas() {
		return sondas;
	}

	public void setSondas(List<Sonda> sondas) {
		this.sondas = sondas;
	}
	
}
