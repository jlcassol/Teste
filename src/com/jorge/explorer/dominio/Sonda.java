package com.jorge.explorer.dominio;

import com.jorge.explorer.enums.Comando;
import com.jorge.explorer.enums.Direcao;

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
	public void movimentar(String comandoMovimentacao, Planeta planeta) {
		
		if(comandoMovimentacao != null){
		
		    char[] movimentos = comandoMovimentacao.toUpperCase().toCharArray(); 
			
			for(int i=0; i<movimentos.length; i++){
				
				//L, R ou M
				String acao = Character.toString(movimentos[i]);
				
				if(Comando.ESQUERDA.toString().equals(acao) || Comando.DIREITA.toString().equals(acao)){
					direcionar(this.getDirecao(), acao);
				}
				else if(Comando.MOVIMENTAR.toString().equals(acao)){
					locomover(planeta);
				}
			}
		}
	}

	
	/**
	 * Metodo que define qual a direcao a sonda deve se posicionar
	 * @param direcao --> Direcao em que a sonda esta apontada
	 * @param sentido --> Sentido em que a sonda deve rotacionar
	 */
	private void direcionar(Direcao direcao, String sentido) {
		this.setDirecao(direcao.direcionar(sentido));
	}
	
	
	/**
	 * Metodo que verifica para qual direcao a sonda se movera
	 * @param planeta --> planeta que a sonda esta explorando
	 */
	private void locomover(Planeta planeta) {
		
		//caso a direcao da sonda seja norte ou sul, realiza a movimentacao no eixo Y
		if(this.getDirecao() == Direcao.N || this.getDirecao() == Direcao.S){
			this.setPosicaoY(realizarMovimento(this.getPosicaoY(), planeta.getAltura()));
		}
		//senao se movimenta no eixo x
		else{
			this.setPosicaoX(realizarMovimento(this.getPosicaoX(), planeta.getLargura()));
		}
	}
	
	
	/**
	 * Metodo que realiza o movimento da sonda, onde se nao for possivel realizar o movimento, 
	 * aguarda o proximo comando ate a sonda poder se movimentar.
	 * @param posicaoAnterior --> posicao anterior da sonda
	 * @param tamanhoEixoPlaneta --> tamanho do eixo do planeta em que a sonda pode explorar
	 * @return posicao calculada da sonda
	 */
	private Integer realizarMovimento(Integer posicaoAnterior, Integer tamanhoEixoPlaneta) {
		
		int novaPosicao = posicaoAnterior + this.getDirecao().getValor();
		
		if(novaPosicao >= 0 || novaPosicao < tamanhoEixoPlaneta){
			return novaPosicao;
		}
		
		return posicaoAnterior;
	}
	
	@Override
	public String obterPosicaoAtual() {
		return "Localizacao = X:"+ this.posicaoX + " Y:" + this.posicaoY + " Direcao:" + this.direcao;
	}
	
}
