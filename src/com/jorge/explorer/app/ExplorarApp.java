package com.jorge.explorer.app;

import java.util.Scanner;

import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;
import com.jorge.explorer.enums.Direcao;

public class ExplorarApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dados do planeta a ser explorado!");
		System.out.println("Planeta eixo X: ");
		Integer eixoX = scanner.nextInt();
		
		System.out.println("Planeta eixo Y: ");
		Integer eixoY = scanner.nextInt();
		
		Planeta planeta = new Planeta(eixoY, eixoX);

		while (true) {
			System.out.println("Dados da sonda!");
			System.out.println("Posicao X: ");
			Integer posicaoX = scanner.nextInt();
			
			System.out.println("Posicao Y: ");
			Integer posicaoY = scanner.nextInt();
			
			System.out.println("Direcao 'N', 'E', 'S' ou 'W': ");
			String direcao = scanner.next();
			
			System.out.println("Movimentos a realizar: ");
			String movimentos = scanner.next();

			Sonda sonda = new Sonda(posicaoX, posicaoY, Direcao.getBySigla(direcao));
			sonda.movimentar(movimentos, planeta);
			
			System.out.println(sonda.obterPosicaoAtual());
			
			System.out.println("");
			System.out.println("");
		}
	}
}
