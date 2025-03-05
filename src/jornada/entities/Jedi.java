package jornada.entities;
public class Fada extends Personagem{
    private String varinha;

    public void comer() {
	System.out.println("transforma pedra em comida");
    }
    public String getVarinha() {
        return varinha;
    }

    public void setVarinha(String varinha) {
        this.varinha = varinha;
    }
}
