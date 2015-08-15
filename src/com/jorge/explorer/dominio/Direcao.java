package com.jorge.explorer.dominio;

/**
 * Enum referente a 'Rosa dos Ventos'
 * @author Jorge Cassol
 *
 */
public enum Direcao {

	N {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.W : Direcao.E);
		}
	},

	E {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.N : Direcao.S);
		}
	},

	S {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.E : Direcao.W);
		}
	},

	W {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.S : Direcao.N);
		}
	};
	
	public final Direcao direcionar(String sentido) {  
        return direcionarPara(sentido);  
    }  
	
	public abstract Direcao direcionarPara(String sentido);
	
	@Override 
	public Direcao direcionarPara(String sentidoRotacao) {
		return(sentidoRotacao.equalsIgnoreCase("L") ? Direcao.W : Direcao.E);
	}
}
