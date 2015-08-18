package com.jorge.explorer.dominio;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Exploracao {

	private Planeta planeta;
	private List<Sonda> sondas;
	
	public Planeta getPlaneta() {
		return planeta;
	}
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	public List<Sonda> getSondas() {
		return sondas;
	}
	public void setSondas(List<Sonda> sondas) {
		this.sondas = sondas;
	}
}
