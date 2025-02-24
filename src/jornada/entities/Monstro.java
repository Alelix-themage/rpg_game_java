package jornada.entities;
public class Monstro extends Personagem{
    
    private String drop;

    public void comer() {
	nome = "";
	System.out.println("Monstro come com as m�os e com os p�s");
    }
    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

}