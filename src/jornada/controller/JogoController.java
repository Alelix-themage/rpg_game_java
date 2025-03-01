package jornada.controller;

import jornada.entities.Comercio;
import jornada.entities.Droids;
import jornada.entities.Habilidade;
import jornada.entities.Fada;
import jornada.entities.Personagem;
import jornada.entities.Sith;
import jornada.artAscii.ArtAscii;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class JogoController {

    //TEXT COLOR
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[37m";

    static Personagem criarPersonagem(Scanner scanner) { 
        //Método responsável por criar o personagem

        System.out.println("-----------------PERSONAGEM--------------------");
        System.out.println("Selecione a raça do seu personagem: ");
        System.out.println("1 - Droid");
        System.out.println("2 - Fada");

        Personagem personagem = null;

        while (personagem == null) {
            String op = scanner.nextLine();

            switch (op) {
                case "1":
                    Droids droid = new Droids();
                    System.out.println("Digite o nome do seu personagem: ");
                    droid.setNome(scanner.nextLine());

                    // Habilidade default
                    Habilidade habdroid = new Habilidade();
                    habdroid.setNome("Teleporte");
                    habdroid.setPoder("Teleportar para vários lugares num raio de 100m");
                    droid.adicionarHabilidade(habdroid);

                    System.out.println(droid.getNome() + " criado com sucesso!");
                    personagem = droid;
                    break;

                case "2":
                    Fada fada = new Fada();
                    System.out.println("Digite o nome do seu personagem: ");
                    fada.setNome(scanner.nextLine());

                    // Habilidade default
                    Habilidade habFada = new Habilidade();
                    habFada.setNome("Animalização");
                    habFada.setPoder("Se transforma em algum animal");
                    fada.adicionarHabilidade(habFada);

                    System.out.println(fada.getNome() + " criada com sucesso!");
                    personagem = fada;
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 1 ou 2.");
            }
        }
        return personagem;
    }

    static public Personagem criarSith(){
       //Função responsável por criar os boss
        
       //Lista de Sith's
        ArrayList<String> siths = new ArrayList<>(
            List.of(
                "Darth Sidious","Darth Vader","Darth Maul","Darth Tyranus", // Conde Dookan
                "Darth Plagueis","Darth Revan","Darth Bane","Darth Nihilus",
                "Darth Malak","Darth Krayt"
        ));

    
       // Escolher um nome aleatório
       Random random = new Random();
       String nomeSith = siths.get(random.nextInt(siths.size()));

       // Criar e retornar um novo Sith com o nome escolhido
       return new Sith(nomeSith);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Bem-vindo ao RPG DE Guerra nas Estrelas!");
        System.out.println("-----------------------------------------");

        // Lista const de planetas do jogo
        ArrayList<String> worlds = new ArrayList<>(List.of(
            "Tatooine", "Coruscant", "Naboo", "Hoth", "Endor", 
            "Mustafar", "Kamino", "Dagobah", "Alderaan", "Geonosis", 
            "Bespin", "Kashyyyk", "Dantooine", "Jakku"
        ));

        // Embaralhar os mundos
        Collections.shuffle(worlds);

        System.out.println(ANSI_YELLOW + ArtAscii.asciiArt);
        System.out.println(ANSI_GREEN + ArtAscii.naveAscii);

        // Laço do Menu do programa
        Personagem personagem = null;
        boolean rodando = true;

        while (rodando) {
            System.out.println("------------------------MENU------------------------------");
            System.out.println("1 - Criar o seu personagem e começar o jogo!");
            System.out.println("2 - Sair");
            System.out.println("----------------------------------------------------------");

            String op = scanner.nextLine();
            switch (op) {
                case "1":
                    personagem = criarPersonagem(scanner);
                    rodando = false; // Sai do menu após criar personagem
                    break;

                case "2":
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    scanner.close();
                    return; // Encerra o jogo

                default:
                    System.out.println("Por favor, selecione uma opção válida!");
            }
        }

        // Loop principal do jogo
        System.out.println("===============================================================");
        System.out.println("Agora sua jornada começa, " + personagem.getNome() + "!");
        for (int i = 0; i < 3; i++) {
            // Criação da Taverna
            Comercio taverna = new Comercio();

            // Escolhe aleatoriamente 3 mundos
            String world = worlds.get(i);
            System.out.println("=================================================================");
            System.out.println("Você chegou em " + world + "!");
            boolean explorando = true;
            
            while (explorando) {
                System.out.println("O que você deseja fazer em " + world + "?");
                System.out.println("1 - Explorar");
                System.out.println("2 - Ir para o próximo mundo");
                System.out.println("3 - Adquirir Habilidade na Taverna");
                String opcao = scanner.nextLine();

                switch (opcao) {
                    case "1":
                        System.out.println(personagem.getNome() + " está explorando " + world + "...");
                        // Lógica de exploração e combate
                        Personagem novoSith = criarSith();
                        String nomeSith = novoSith.getNome();
                        System.out.println("-----------------------------------------------");
                        System.out.println("Oh não! " + nomeSith + " acaba de aparecer para acabar com a República!");

                        break;
                    case "2":
                        System.out.println("======================================================");
                        System.out.println("Partindo para o próximo mundo...");
                        System.out.println(ArtAscii.planetAscii);
                        explorando = false;
                        break;
                    case "3":

                        System.out.println("======================================================");
                        System.out.println("Entrando na Taverna...");
                        float coin = 5;
                        float pocao = taverna.comprarVida(coin);

                        personagem.curar(pocao);
                        personagem.getVida();

                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }

        System.out.println("Você explorou 3 mundos!");
        scanner.close();
        System.out.println(ANSI_RESET);
    }
}


//moeda ->quando matar um Sith