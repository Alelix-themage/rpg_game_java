package jornada.entities;
public class Sith extends Personagem{
    
    private String drop;
    public String Nome;
    public String raca;
    private int força;

    public Sith(String novoNome, String novaRaca) {
        nome = novoNome;
        raca = novaRaca;
    }
    private void Sith(){
        this.força = 5;
    }
    

    public void atirar(){
        nome = "";
        System.out.println( "Clone atiram!");
    }
    

    public void comer() {
	nome = "";
	System.out.println("Comendo...");
    }
    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

}