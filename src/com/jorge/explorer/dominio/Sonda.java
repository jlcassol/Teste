package com.jorge.explorer.dominio;

/**
 * Classe responsável por criar o modelo de Sondas
 * @author Jorge Cassol
 *
 */
public class Sonda implements SondaInterface{

	private Integer posicaoX;
	private Integer posicaoY;
	private String direcao;
	
	public Sonda(Integer posicaoX, Integer posicaoY, String direcao) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.direcao = direcao;
	}

	public Integer getPosicaoX() {
		return posicaoX;
	}
	
	public void setPosicaoX(Integer posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public Integer getPosicaoY() {
		return posicaoY;
	}
	
	public void setPosicaoY(Integer posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	public String getDirecao() {
		return direcao;
	}
	
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	@Override
	public void movimentar(String comandoMovimentacao) {
		
		
		
	}

	@Override
	public String obterPosicaoAtual() {
		return "Localizacao = X:"+ this.posicaoX + " Y:" + this.posicaoY + " Direcao:" + this.direcao;
	}
	
}
