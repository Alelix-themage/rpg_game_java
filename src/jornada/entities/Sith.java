package jornada.entities;
public class Sith extends Personagem{
    
    private String drop;
    private String nome;
    private String raca;
    private float forca;

    public Sith() {
        this.nome = "--";
        this.raca = "--";
        this.forca = 15;
        this.vida = 100;
    }

    public Sith(String novoNome) {
        this.nome = novoNome;
        this.forca = 15;

        //Sith inicia a vida com 50
        this.vida = this.vida - 50.0f;

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
    
    public float getForca(){
        return forca;
    }
    
    public void setForca(float forca){
        this.forca = forca;
    }
}
  