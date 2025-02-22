package com.jornada.controller;

import com.jornada.entities.Habilidade;
import com.jornada.entities.Monstro;
import com.jornada.entities.Personagem;

public class JogoController {
    
    public static void main(String[] args) {
	Habilidade habNova = new Habilidade();
	habNova.setNome("fogo");
	habNova.setPoder("atacar inimigos com fogo");
	
	Habilidade habNova2 = new Habilidade();
	habNova2.setNome("danca marcial");
	habNova2.setPoder("dançar para enganar os inimigos");
	
	Habilidade habTeia = new Habilidade();
	habTeia.setNome("teia");
	habTeia.setPoder("jogar teia que gruda nos prédios");
		
	Monstro m1 = new Monstro();
	m1.setNome("Godzilla");
	m1.setRaca("lagarto");
	m1.adicionarHabilidade(habTeia);
	
	
	Personagem p1 = new Personagem();
	
	Personagem p2 = new Personagem("Homem-aranha","hibrido",habTeia);
	
	Personagem p = new Personagem("Hulk","Monstro");
	System.out.println(p.getNome());
	p.adicionarHabilidade(habNova);
	p.adicionarHabilidade(habNova2);
	
	
	System.out.println(p.getPoderes());
    }
}
