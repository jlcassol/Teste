package com.jorge.explorer.dominio;

/**
 * Classe responsável por criar o modelo de Sondas
 * @author Jorge Cassol
 *
 */
public class Sonda implements SondaInterface{

	private Integer posicaoX;
	private Integer posicaoY;
	private Direcao direcao;
	
	public Sonda(Integer posicaoX, Integer posicaoY, Direcao direcao) {
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
	
	public Direcao getDirecao() {
		return direcao;
	}
	
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public void movimentar(String comandoMovimentacao) {
		
		if(comandoMovimentacao != null){
		
		    char[] movimentos = comandoMovimentacao.toUpperCase().toCharArray(); 
			
			for(int i=0; i<movimentos.length; i++){
				
				switch (movimentos[i]) {
				case 'L' | 'R':
					direcionar(this.getDirecao(), Character.toString(movimentos[i]));
					break;
				
				case 'M':
					movimentar();
					break;
					
				default:
					System.out.println("Comando descartado por ser invalido:" + movimentos[i]);
					break;
				}
			}
		}
	}

	private void movimentar() {
		
	}

	private void direcionar(Direcao direcao, String sentido) {
		this.setDirecao(direcao.direcionar(sentido));
	}

	@Override
	public String obterPosicaoAtual() {
		return "Localizacao = X:"+ this.posicaoX + " Y:" + this.posicaoY + " Direcao:" + this.direcao;
	}
	
}
