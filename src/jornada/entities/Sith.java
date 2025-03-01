package jornada.entities;
public class Sith extends Personagem{
    
    private String drop;
    private String nome;
    private String raca;
    private int forca;


    public Sith(String novoNome, String novaRaca) {
        this.nome = novoNome;
        this.raca = novaRaca;
        this.forca = 5;
    }

    public void atirar(){
        System.out.println(nome + "esta atirando!");
    }
    
    public void comer() {
	System.out.println(nome + "Comendo...");
    }
    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public int getForca(){
        return forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public String getDemocracia(){
        return democracia;

    }
    public void setDemocracia(String democracia){
        this.democracia = democracia;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void getVida(){
        System.out.println("Vida: " + vida);
    }

}


