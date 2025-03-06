package jornada.entities;
import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    protected String nome;
    private String raca;


    //variável força para teste
    protected float forca = 30;

   //Bolsa de moedas 
    float bolsa  = 0;

    protected float vida = 100;



    // Lista de elementos (objetos) do tipo especificado entre <>
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();
    
    //construtor: 1o.m�todo chamado ao criar um objeto da classe,
    // ou seja, chamou o 'new' este m�todo � chamado.
    public Personagem(String novoNome, String novoRaca) {
	nome = novoNome;
	raca = novoRaca;
    }
    public Personagem() {
	nome = "--";
	raca = "--";
    }
    public Personagem(String novoNome, String novaRaca, Habilidade habNova) {
	nome = novoNome;
	raca = novaRaca;
	this.adicionarHabilidade(habNova);
    }
    
 
    public void adicionarHabilidade(Habilidade hab) {
	habilidades.add(hab);
    }
    
    public String getPoderes() {
	String poderes = "";
	for (Habilidade h : habilidades) {
	    poderes = poderes +"; "+ h.getPoder();
	}
	return poderes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public void levarDano(float dano){
        // Função que recebe o dano do personagem
        this.vida = this.vida - dano;
    }
    
    public void curar(float cura){
        vida = vida + cura;
    }

    public float getVida(){
        return vida;
    }

    public void setCoin(float coin){
        //Recebe dinheiro pela batalha
        this.bolsa = coin;

        System.out.println("Parabéns! Você acaba de receber " + coin + " créditos imperiais pela batalha!");
    }

    public float getCoin(){
        //Retorna Créditos Imperiais
        return bolsa;
    }

    public float buyTaverna(){
        //Retorna Créditos Imperiais para ser usado na Taverna
        if(this.bolsa < 5.0){
            System.out.println("Você não possui créditos imperiais o suficiente!");
            return 0.0f;
        }

        else {
            this.bolsa = this.bolsa - 5;
            float coin = 5.0f;
            return coin;
        }
    }

    public float getForca(){
        //Retorna a força para ser utilizada na batalha
        return forca;
    }


    public void upLevel(float constant){

        forca = forca * constant;

        System.out.println("================================================================");
        System.out.println("Meus parabéns " + getNome() + " seu level foi aumentado com sucesso!");
        System.out.println("Que a força esteja com você!");
        System.out.println(getNome() + "                                    FORÇA: " + getForca());


    }

    public abstract void comer();
}
