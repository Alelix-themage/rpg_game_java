package jornada.entities;
public class Jedi extends Personagem{
    private String nome;
    private String genero;
    private float forca;
    
    public Jedi(String novoNome, String novoGenero) {
        this.nome = novoNome;
        this.genero = novoGenero;
        this.forca = 10;
        this.vida = 100;
    }
    public void comer() {
	System.out.println(nome + "comeu uma barra de cereal");
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
    
    public float getForca(){
        return forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public float getVida(){
        return vida;
    }
    public void setVida(float vida){
        this.vida = vida;
    }
}
