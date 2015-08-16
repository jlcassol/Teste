package com.jorge.explorer.test;

import com.jorge.explorer.dominio.Direcao;
import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;

public class ExploracaoTest {

	public static void main(String[] args) {
		
		Planeta planeta = new Planeta(5, 5);
		
		Sonda sonda = new Sonda(1, 2, Direcao.N);
		sonda.setPlaneta(planeta);
		sonda.movimentar("LMLMLMLMM");
		
		System.out.println(sonda.obterPosicaoAtual());
		
		sonda = new Sonda(3, 3, Direcao.E);
		sonda.setPlaneta(planeta);
		sonda.movimentar("MMRMMRMRRM");
		
		System.out.println(sonda.obterPosicaoAtual());
	}
}
