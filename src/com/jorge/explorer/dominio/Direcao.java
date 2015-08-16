package com.jorge.explorer.dominio;

/**
 * Enum referente a 'Rosa dos Ventos'
 * @author Jorge Cassol
 *
 */
public enum Direcao {

	N(1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.W : Direcao.E);
		}
	},

	E(1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.N : Direcao.S);
		}
	},

	S(-1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.E : Direcao.W);
		}
	},

	W(-1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.S : Direcao.N);
		}
	};
	
	
	public final Direcao direcionar(String sentido) {  
        return direcionarPara(sentido);  
    }  
	
	public abstract Direcao direcionarPara(String sentido);
	
	
	private final Integer valor; 
	
	
	private Direcao(Integer valorOpcao) {
		valor = valorOpcao;
	} 
	
	
	public Integer getValor(){ 
		return valor; 
	}

}
