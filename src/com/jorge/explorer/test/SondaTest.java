package com.jorge.explorer.test;

import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;
import com.jorge.explorer.enums.Direcao;

import junit.framework.TestCase;

public class SondaTest extends TestCase{
	
	Planeta planeta = new Planeta(5, 5);

	public void testPropostoNoExercicio1(){
		
		Sonda sonda1 = new Sonda(1, 2, Direcao.N);
		
		String comandoTest = "LMLMLMLMM";
		
		sonda1.movimentar(comandoTest, planeta);
		
		assertEquals(1, sonda1.getPosicaoX().intValue());
		assertEquals(3, sonda1.getPosicaoY().intValue());
		assertEquals(Direcao.N, sonda1.getDirecao());
	}
	
	public void testPropostoNoExercicio2(){
		
		Sonda sonda1 = new Sonda(3, 3, Direcao.E);
		String comandoTest = "MMRMMRMRRM";
		
		sonda1.movimentar(comandoTest, planeta);
		
		assertEquals(5, sonda1.getPosicaoX().intValue());
		assertEquals(1, sonda1.getPosicaoY().intValue());
		assertEquals(Direcao.E, sonda1.getDirecao());
	}
	
	public void testSondaImpossibilitadaDeMover(){
		
		Sonda sonda1 = new Sonda(0, 0, Direcao.S);
		String comandoTest = "MMLMM";
		
		sonda1.movimentar(comandoTest, planeta);
		
		assertEquals(2, sonda1.getPosicaoX().intValue());
		assertEquals(0, sonda1.getPosicaoY().intValue());
		assertEquals(Direcao.E, sonda1.getDirecao());
	}
	
	public void testSondaImpossibilitadaDeMoverDuasVezes(){
		
		Sonda sonda1 = new Sonda(0, 0, Direcao.S);
		String comandoTest = "MMRMMRMM";
		
		sonda1.movimentar(comandoTest, planeta);
		
		assertEquals(0, sonda1.getPosicaoX().intValue());
		assertEquals(2, sonda1.getPosicaoY().intValue());
		assertEquals(Direcao.N, sonda1.getDirecao());
	}
	
}
