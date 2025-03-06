package jornada.entities;
public class Clone extends Personagem {
    private String genero;

    private String patente;
    private String nome;
<<<<<<< HEAD
    private float blasters = 50;
        
    public Clone() {
        this.nome = "--";
        this.genero = "--";
        this.vida = 100;
        this.blasters = 50;

    }

    public Clone(String novoNome, String novoGenero, int vida) {
        this.nome = novoNome;
        this.genero = novoGenero;
        this.vida = 100;
        this.blasters = 50;
    }
=======
   
    
    //Star Wars Episode III
    private boolean democracia = true;
    
>>>>>>> 577805467b5dfa71b1576476914bcf9eda935180
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

<<<<<<< HEAD
    public float getVida(){
        return vida;
    }

    public void setVida(float vida){
        this.vida = vida;
    }

    public float getBlasters(){
        return blasters;
    }
    public void setBlasters(float blasters){
        this.blasters = blasters;
    }


=======
    public boolean getDemocracia(){
        return democracia;
    }
    public void setDemocracia(boolean democracia){
        this.democracia = democracia;
    }

>>>>>>> 577805467b5dfa71b1576476914bcf9eda935180
}

// Republicano (Personagem) ->Jedi, Clones, Droids
// Imperial --> Siths 