package com.jorge.explorer.enums;

/**
 * Enum referente a 'Rosa dos Ventos'
 * @author Jorge Cassol
 *
 */
public enum Direcao {

	N(1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.W : Direcao.E);
		}
	},

	E(1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.N : Direcao.S);
		}
	},

	S(-1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.E : Direcao.W);
		}
	},

	W(-1) {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.S : Direcao.N);
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
