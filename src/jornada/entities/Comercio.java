package jornada.entities;



public class Comercio extends Personagem  {
    // variável que armazena o ganho do comércio
    private float arrecadacao = 0;
    private float valor_habilidade = 5;
    private float cura = 5;

    @Override
    public void comer() {
        System.out.println("O comércio não precisa comer.");
    }

    public void comprarVida(float preco){
        if(preco != valor_habilidade){
            System.out.println("Você não tem dinheiro o suficiente para comprar uma habilidade!");
        }
        else {
           this.arrecadacao = this.arrecadacao + preco;
           System.out.println("Você acaba de adquirir uma poção de cura!");
           curar(cura);

           System.out.println("Você acaba de Ser curado!");
           getVida();
           
        }
    }
}

