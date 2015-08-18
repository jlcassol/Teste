package com.jorge.explorer.enums;

/**
 * Enum responsavel por simplificar tipos de comandos
 * @author Jorge Cassol
 *
 */
public enum Comando {

	ESQUERDA("L"), DIREITA("R"), MOVIMENTAR("M");

	private final String comando;

	private Comando(final String comando) {
		this.comando = comando;
	}

	@Override
	public String toString() {
		return comando;
	}

}
