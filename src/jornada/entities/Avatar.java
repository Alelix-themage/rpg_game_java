package jornada.entities;
public class Avatar extends Personagem {
    private String genero;

    public void comer() {
	System.out.println("gosta somente de alimentos industrializados");
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}



// Republicano (Personagem) ->Jedi, Clones, Droids
// Imperial --> Siths 