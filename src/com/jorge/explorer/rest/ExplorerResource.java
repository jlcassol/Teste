package com.jorge.explorer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jorge.explorer.dominio.Exploracao;
import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;
import com.jorge.explorer.enums.Direcao;

@Path("/explorar")
public class ExplorerResource {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<Sonda> criarExploracao(Exploracao exploracao){
		
		Planeta planeta = exploracao.getPlaneta();
		for(Sonda sonda : exploracao.getSondas()){
			sonda.movimentar(planeta);
			System.out.println(sonda.obterPosicaoAtual());
		}
		return exploracao.getSondas();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Exploracao obterExploracao(){
		
		Exploracao exploracao = new Exploracao();

		Planeta planeta = new Planeta(5, 5);
		exploracao.setPlaneta(planeta);
		
		List<Sonda> sondas = new ArrayList<Sonda>();
		
		Sonda sonda1 = new Sonda(1, 2, Direcao.N, "LMLMLMLMM");
		Sonda sonda2 = new Sonda(3, 3, Direcao.E, "MMRMMRMRRM");
		
		sondas.add(sonda1);
		sondas.add(sonda2);
		
		exploracao.setSondas(sondas);
		
		return exploracao;
	}
}
