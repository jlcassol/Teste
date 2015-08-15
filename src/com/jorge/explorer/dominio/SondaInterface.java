package com.jorge.explorer.dominio;

/**
 * Interface utilizada para criar sondas
 * @author Jorge Cassol
 * 
 */
public interface SondaInterface {

	public void movimentar(String comandoMovimentacao);
	
	public String obterPosicaoAtual();
}
