package com.jorge.explorer.test;

import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;
import com.jorge.explorer.enums.Direcao;

public class ExploracaoTest {

	public static void main(String[] args) {
		
		Planeta planeta = new Planeta(5, 5);
		
		Sonda sonda = new Sonda(1, 2, Direcao.N);
		sonda.movimentar("LMLMLMLMM", planeta);
		
		System.out.println(sonda.obterPosicaoAtual());
		
		sonda = new Sonda(3, 3, Direcao.E);
		sonda.movimentar("MMRMMRMRRM", planeta);
		
		System.out.println(sonda.obterPosicaoAtual());
	}
}
