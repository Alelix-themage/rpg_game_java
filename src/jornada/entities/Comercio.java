package jornada.entities;
public class Comercio   {
    // variável que armazena o ganho do comércio
    private float arrecadacao = 0;
    private float valor_habilidade = 5;
    private float cura = 5;


    public float comprarVida(float coin){
        if(coin != valor_habilidade){
            System.out.println("Você não tem dinheiro o suficiente para comprar uma habilidade!");
            return 0;
        }
        else {
           this.arrecadacao = this.arrecadacao + coin;
           System.out.println("Você acaba de adquirir uma poção de cura!");

           return cura;
           
        }
    }
}

