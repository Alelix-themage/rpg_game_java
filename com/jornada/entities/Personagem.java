package com.jornada.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    protected String nome;
    private String raca;
    // Lista de elementos (objetos) do tipo especificado entre <>
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();
    
    //construtor: 1o.método chamado ao criar um objeto da classe,
    // ou seja, chamou o 'new' este método é chamado.
    public Personagem(String novoNome, String novoRaca) {
	nome = novoNome;
	raca = novoRaca;
    }
    public Personagem() {
	nome = "--";
	raca = "--";
    }
    public Personagem(String novoNome, String novaRaca, Habilidade habNova) {
	nome = novoNome;
	raca = novaRaca;
	this.adicionarHabilidade(habNova);
    }
    
 
    public void adicionarHabilidade(Habilidade hab) {
	habilidades.add(hab);
    }
    
    public String getPoderes() {
	String poderes = "";
	for (Habilidade h : habilidades) {
	    poderes = poderes +"; "+ h.getPoder();
	}
	return poderes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
    
    public abstract void comer();
}
