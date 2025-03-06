package jornada.entities;
public class Clone extends Personagem {
    private String genero;

    private String patente;
    private String nome;
   
    
    //Star Wars Episode III
    private boolean democracia = true;
    
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

    public boolean getDemocracia(){
        return democracia;
    }
    public void setDemocracia(boolean democracia){
        this.democracia = democracia;
    }

}



// Republicano (Personagem) ->Jedi, Clones, Droids
// Imperial --> Siths 