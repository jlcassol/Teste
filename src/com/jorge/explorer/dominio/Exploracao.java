package com.jorge.explorer.dominio;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Exploracao {

	private Planeta planeta;
	
	@XmlElementWrapper(name="sondas")
	@XmlElement(name="sonda")
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
