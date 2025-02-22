package com.jornada.entities;

public class Monstro extends Personagem{
    
    private String drop;

    public void comer() {
	nome = "";
	System.out.println("Monstro come com as mãos e com os pés");
    }
    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

}