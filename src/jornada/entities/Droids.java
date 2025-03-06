package jornada.entities;
public class Droids extends Personagem {
   private String nome;
   private String genero;
   private float choque = 50;



   public Droids() {
       this.nome = "--";
       this.genero = "--";
       this.vida = 100;
       this.choque = 50;
   }
   public Droids(String novoNome, String novoGenero) {
       this.nome = novoNome;
       this.genero = novoGenero;
       this.vida = 100;
       this.choque = 50;
       
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    // Implementação do método abstrato comer()
    @Override
    public void comer() {
        System.out.println(nome + "Você está tomando oleo e recuperou 2.5 de vida");
    }   

    //choque para ataque

    public float getchoque(){
        return choque;
    }

    public void setchoque(int choque){
        this.choque = choque;
    }
}