package jornada.entities;
public class Clone extends Personagem {
    private String genero;

    private String patente;
    private String nome;
    private String democracia = "Imperio";
    private int vida = 75;    

    public void comer() {
	System.out.println("gosta somente de alimentos industrializados");
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
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



// Republicano (Personagem) ->Jedi, Clones, Droids
// Imperial --> Siths 