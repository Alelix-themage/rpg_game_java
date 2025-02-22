package com.jornada.entities;

public class Duende extends Personagem {
    private String pocaoMagica;

    public void comer() {
	System.out.println("duende toma somente liquidos");
    }
    public String getPocaoMagica() {
        return pocaoMagica;
    }

    public void setPocaoMagica(String pocaoMagica) {
        this.pocaoMagica = pocaoMagica;
    }
}
