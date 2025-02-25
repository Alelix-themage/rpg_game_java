package jornada.controller;

import jornada.entities.Comercio;
import jornada.entities.Duende;
import jornada.entities.Habilidade;
import jornada.entities.Fada;
import jornada.artAscii.ArtAscii;

import java.util.*;



public class JogoController {

    //TEXT COLOR
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[37m";

  
    
    static void criarPersonagem(Scanner scanner) { 
        System.out.println("-----------------PERSONAGEM--------------------");
        System.out.println("Selecione a raça do seu personagem: ");
        System.out.println("1 - Duende");
        System.out.println("2 - Fada");

        String op = scanner.nextLine();

        switch (op) {
            case "1":
                Duende duende1 = new Duende();
                System.out.println("Digite o nome do seu personagem: ");
                String nome = scanner.nextLine();
                duende1.setNome(nome);

				//Habilidade default
                Habilidade hab1 = new Habilidade();
                hab1.setNome("Teleporte");
                hab1.setPoder("Teleportar para vários lugares num raio de 100m");

                System.out.println(nome + " criado com sucesso!");
                break;
                
            
            case "2":
                Fada fada1 = new Fada();
                System.out.println("Digite o nome do seu personagem: ");
                String nome_fada = scanner.nextLine();
                fada1.setNome(nome_fada);

				//Habilidade default
                Habilidade hab_fada = new Habilidade();
                hab_fada.setNome("Animalização");
                hab_fada.setPoder("Se transforma em algum animal");

                System.out.println(nome_fada + " criado com sucesso!");
                break;  
            
            default:
                System.out.println("Opção inválida! Escolha entre 1 ou 2.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Bem-vindo ao RPG DE Guerra nas Estrelas!");
        System.out.println("-----------------------------------------");

		//Lista const de planetas do jogo
        ArrayList<String> worlds = new ArrayList<>(List.of(
            "Tatooine", "Coruscant", "Naboo", "Hoth", "Endor", 
            "Mustafar", "Kamino", "Dagobah", "Alderaan", "Geonosis", 
            "Bespin", "Kashyyyk", "Dantooine", "Jakku"
        ));

		//embaralhar os mundos
		Collections.shuffle(worlds);


        
        System.out.println(ANSI_YELLOW + ArtAscii.asciiArt);



        System.out.println( ANSI_GREEN + ArtAscii.naveAscii);

        
     

        
        // Laço do Menu do programa
        boolean rodando = true;
        while (rodando) {
            System.out.println("------------------------MENU------------------------------");
            System.out.println("1 - Criar o seu personagem e comece o jogo!");
            System.out.println("2 - Sair");
            System.out.println("----------------------------------------------------------");

            String op = scanner.nextLine();
            switch (op) {
                case "1":
                    criarPersonagem(scanner);
                    break;

                case "2":
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    rodando = false;
                    break;

                default:
                    System.out.println("Por favor, selecione uma opção válida!");
            }
            break;   
        }


	//loop principal do jogo
	 for (int i = 0; i < 3; i++) {

        //Criação da Taverna
        Comercio taverna = new Comercio();

		//Escolhe aleatoriamente 3 mundos
            String world = worlds.get(i); 
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
                        System.out.println("Explorando " + world + "...");
                        // Exploração e combate
                        break;
                    case "2":
                        System.out.println("Partindo para o próximo mundo...");
                        System.out.println(ArtAscii.planetAscii);
                        explorando = false;
                        break;
                    case "3":
                        System.out.println("Entrando na Taverna...");
                        float coin = 5;
                        taverna.comprarVida(coin);
                        explorando = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
        System.out.println("Você explorou 3 mundos!");

		//passar os mundos de forma aleatória!
		// cada mundo terá 5 Sith's
		// sendo uma mais forte que o outro e com mais vida


		scanner.close(); 
        System.out.println(ANSI_RESET);
    
    }

}
