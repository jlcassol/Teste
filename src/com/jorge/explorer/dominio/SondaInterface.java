package com.jorge.explorer.dominio;

/**
 * Interface utilizada para criar sondas
 * @author Jorge Cassol
 * 
 */
public interface SondaInterface {

	/**
	 * Metodo para realizar a movimentacao das sondas
	 * @param planeta --> Planeta em que a sonda vai explorar
	 */
	public void movimentar(Planeta planeta);
	
	/**
	 * Metodo para verificar posicao das sondas
	 * @return Retorna posicao atual da sonda
	 */
	public String obterPosicaoAtual();
}
