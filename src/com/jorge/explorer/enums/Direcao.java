package com.jorge.explorer.enums;

/**
 * Enum referente a 'Rosa dos Ventos'
 * @author Jorge Cassol
 *
 */
public enum Direcao {

	N(1, "N") {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.W : Direcao.E);
		}
	},

	E(1, "E") {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.N : Direcao.S);
		}
	},

	S(-1, "S") {
		@Override 
		public Direcao direcionarPara(String sentidoRotacao) {
			return(Comando.ESQUERDA.toString().equals(sentidoRotacao) ? Direcao.E : Direcao.W);
		}
	},

	W(-1, "W") {
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
	private final String sigla; 
	
	private Direcao(Integer valor, String sigla) {
		this.valor = valor;
		this.sigla = sigla;
	} 
	
	public Integer getValor(){ 
		return this.valor; 
	}
	
	public String getSigla(){ 
		return this.sigla; 
	}
	
	public static Direcao getBySigla(String sigla) {
		
		for (Direcao direcao : Direcao.values()) {
			
			if (direcao.getSigla().equalsIgnoreCase(sigla)){
				return direcao;
			}
		}
		
		return null;
	}
	
}
