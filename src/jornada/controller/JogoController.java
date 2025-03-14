package jornada.controller;

import jornada.entities.Comercio;
import jornada.entities.Droids;
import jornada.entities.Habilidade;
import jornada.entities.Jedi;
import jornada.entities.Personagem;
import jornada.entities.Sith;
import jornada.entities.Clone;
import jornada.artAscii.ArtAscii;

import java.util.*;

public class JogoController {

    //TEXT COLOR
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[37m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";


    static Personagem criarPersonagem(Scanner scanner) { 
        //Método responsável por criar o personagem

        System.out.println("-----------------PERSONAGEM--------------------");
        System.out.println("Selecione a raça do seu personagem: ");
        System.out.println("1 - Droids");
        System.out.println("2 - Jedi");
        System.out.println("3 - Clone");

        Personagem personagem = null;

        while (personagem == null) {
            String op = scanner.nextLine();

            switch (op) {
                case "1":
                    
                    Droids droids = new Droids();
                    System.out.println("Digite o nome do seu personagem: ");
                    droids.setNome(scanner.nextLine());

                    // Habilidade default
                    Habilidade habDroid = new Habilidade();
                    habDroid.setNome("Choque");
                    habDroid.setPoder("Da choque nos inimigos");
                    droids.adicionarHabilidade(habDroid);

                    System.out.println(droids.getNome() + " criado com sucesso!");
                    personagem = droids;
                    break;

                case "2":
                    Jedi jedi = new Jedi();
                    System.out.println("Digite o nome do seu personagem: ");
                    jedi.setNome(scanner.nextLine());

                    // Habilidade default
                    Habilidade habFada = new Habilidade();
                    habFada.setNome("Telepatia");
                    habFada.setPoder("Consegue sentir a força das pessoas.");
                    jedi.adicionarHabilidade(habFada);

                    System.out.println(jedi.getNome() + " criada com sucesso!");
                    personagem = jedi;
                    break;
                case "3":
                    Clone clone = new Clone();
                    System.out.println("Digite o nome do seu personagem: ");
                    clone.setNome(scanner.nextLine());  

                    //habilidade default
                    Habilidade habClone = new Habilidade();
                    habClone.setNome("Ataque");
                    habClone.setPoder("Ataque com arma de fogo");
                    clone.adicionarHabilidade(habClone);

                    System.out.println(clone.getNome() + " criado com sucesso!");
                    personagem = clone;
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
        String sith = siths.get(random.nextInt(siths.size()));
 
 
        // Criar e retornar um novo Sith com o nome escolhido
        return new Sith(sith);
     }
 
 
     static public float batalha(Personagem per1, Personagem sith ){
         Scanner scanner = new Scanner(System.in);
 
         System.out.println(ANSI_RED + "=====================================================");
         System.out.println("======================BATALHA========================");
         System.out.println("=====================================================");
 
         System.out.println(sith.getNome() + " sacou o sabre de luz! Se prepare!");
 
         boolean flag = true;
 
 
         while(flag){
             //Loop da batalha
             
             System.out.println("---------------------------------------------------");
             System.out.println("1 - Atacar!");
             System.out.println("2 - Fugir!");
 
             System.out.print("Digite a sua opção: ");
             String op = scanner.nextLine();
 
             switch(op){
                 
                 
 
 
                 case "1":
 
                     //força do personagem
                     float dano_per = per1.getForca();
      
 
                     //força do Sith
                     float dano_sith = sith.getForca();
 
                     sith.levarDano(dano_per);
 
                     System.out.println("----------------------------------------------------------------");
                     System.out.println(sith.getNome() + " recebeu " + dano_per + " de dano!");
                     System.out.println( sith.getNome() + "                         VIDA: " + sith.getVida());
                     System.out.println("----------------------------------------------------------------");
 
                     if(sith.getVida() <= 0){
                         // Verifica se o Sith morreu
                         System.out.println("-------------------------------------------------------------------------");
                         System.out.println("Você irá viver por mais um dia! Acaba de derrotar o Sith, meus parabéns!!");
 
                         per1.upLevel(1.5f);
 
                         System.out.println(ANSI_GREEN);
                         return 5.0f;
                     }
 
                     else {
                         System.out.println( per1.getNome() + "                         VIDA: " + per1.getVida());
                         System.out.println("Se prepare para o conta ataque do " + sith.getNome());
 
                         per1.levarDano(dano_sith);
 
                         System.out.println("----------------------------------------------------------------");
                         System.out.println(per1.getNome() + " recebeu " + dano_per + " de dano!");
                         System.out.println( per1.getNome() + "                         VIDA: " + per1.getVida());
                         System.out.println("----------------------------------------------------------------");
 
                         if(per1.getVida() <= 0){
                             System.out.println("----------------------------------------------------------------");
                             System.out.println("Os rebeldes acabam de perder um grande guerreiro! Você morreu!");
                             return 0;
                         }
 
                         break;
                     }
 
                 
                 case "2":
 
                     dano_sith = sith.getForca();
             
                     Random rand = new Random();
 
                     //Implementa uma lógica randomica que se o resto for 0 o personagem consegue fugir
                     // Se não, ele leva dano
 
                     float n = rand.nextInt(100);
 
                     n = n * 0.5f;
 
                     float result = n % 2;
                     System.out.println("Numero teste: " + Float.toString(n));
 
                     if(result == 0){
                         System.out.println("----------------------------------------------------------------");
                         System.out.println("Você conseguiu fugir do " + sith.getNome() + " , mas não se anime! Ele pode voltar!");
                         
                         return 0.0f;
                     }
 
                    else {
                         System.out.println( per1.getNome() + "                         VIDA: " + per1.getVida());
                         System.out.println("Se prepare para o conta ataque do " + sith.getNome());
 
                         per1.levarDano(dano_sith);
 
                         System.out.println("----------------------------------------------------------------");
                         System.out.println(per1.getNome() + " recebeu " + dano_sith + " de dano!");
                         System.out.println( per1.getNome() + "                         VIDA: " + per1.getVida());
                         System.out.println("----------------------------------------------------------------");
 
                         break;
                     } 
                    
 
                 default:
                     System.out.println("Por favor, selecione uma opção existente!");
             }
         }
 
 
         scanner.close();
         System.out.println(ANSI_GREEN);
 
         return 0.0f;
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
                System.out.println("4 - Consultar Vida");
                System.out.println("5 - Consultar Créditos Imperiais");
                String opcao = scanner.nextLine();
                switch (opcao) {
                    case "1":
                        System.out.println(personagem.getNome() + " está explorando " + world + "...");
                        // Lógica de exploração e combate
                        Personagem novoSith = criarSith();
                        //A cada loop aumenta a força do Sith
                        novoSith.upLevel(1.3f);
                        String nomeSith = novoSith.getNome();
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Oh não! " + nomeSith + " acaba de aparecer para acabar com a República!");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Se prepare para a luta!");
                        float coin = batalha(personagem, novoSith);
                        novoSith = null;
                        personagem.setCoin(coin);

                        

                        break;
                    case "2":
                        System.out.println("======================================================");
                        System.out.println("Partindo para o próximo mundo...");
                        System.out.println(ANSI_ORANGE +  ArtAscii.planetAscii + ANSI_GREEN);
                        explorando = false;
                        break;
                    case "3":

                        System.out.println("======================================================");
                        System.out.println("Entrando na Taverna...");
                        float pocao = taverna.comprarVida(personagem.buyTaverna());

                        personagem.curar(pocao);
                        personagem.getVida();
                    case "4":

                        System.out.println("======================================================");
                        System.out.println(personagem.getNome() + "                   VIDA: " + personagem.getVida());
                        System.out.println("======================================================");
                    case "5":

                        System.out.println("======================================================");
                        System.out.println(personagem.getNome() + "                   Créditos Imperiais: " + personagem.getCoin());
                        System.out.println("======================================================");
            
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }

        System.out.println("Você explorou 3 mundos!");
        System.out.println(ANSI_RESET);
        scanner.close();
        
    }
}