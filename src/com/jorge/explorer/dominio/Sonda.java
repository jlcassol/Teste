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
	private Planeta planeta;
	
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

	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	
	@Override
	public void movimentar(String comandoMovimentacao) {
		
		if(comandoMovimentacao != null){
		
		    char[] movimentos = comandoMovimentacao.toUpperCase().toCharArray(); 
			
			for(int i=0; i<movimentos.length; i++){
				
				//L, R ou M
				String acao = Character.toString(movimentos[i]);
				
				if("L".equals(acao) || "R".equals(acao)){
					direcionar(this.getDirecao(), acao);
				}
				else if("M".equals(acao)){
					locomover();
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
	
	
	private void locomover() {
		
		if(this.getDirecao() == Direcao.N || this.getDirecao() == Direcao.S){
			
			this.setPosicaoY(isPossivelMovimentar(this.getPosicaoY(), this.planeta.getAltura()));
			
		}else{
			
			this.setPosicaoX(isPossivelMovimentar(this.getPosicaoX(), this.planeta.getLargura()));
			
		}
		
	}
	
	
	private Integer isPossivelMovimentar(Integer sentido, Integer medida) {
		
		int posicao = sentido + this.getDirecao().getValor();
		
		if(posicao >= 0 || posicao < medida){
			return posicao;
		}
		
		return sentido;
	}
	
	@Override
	public String obterPosicaoAtual() {
		return "Localizacao = X:"+ this.posicaoX + " Y:" + this.posicaoY + " Direcao:" + this.direcao;
	}
	
}
