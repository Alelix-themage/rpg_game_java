package jornada.entities;
public class Droids extends Personagem {
    private String pocaoMagica;



   private String nome;
   private int vida = 50;
   private String genero;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void exibirVida(){
        System.out.println("Vida: " + vida);
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}