package jornada.controller;

import jornada.entities.Duende;
import jornada.entities.Habilidade;
import jornada.entities.Monstro;
import jornada.entities.Fada;

// import jornada.entities.Personagem;

import java.util.*;



public class JogoController {
    

	static void criarPersonagem(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("-----------------PERSONAGEM--------------------");
		System.out.println("Selecione a raça do seu personagem: ");
		System.out.println("1 - Duende");
		System.out.println("2 - Fada");

		String op  = scanner.nextLine();

		switch (op) {
			case "1":
				Duende duende1  = new Duende();
				System.out.println("Digite o nome do seu personagem: ");
				String nome = scanner.nextLine();
				duende1.setNome(nome);

				Habilidade hab1 = new Habilidade();
				hab1.setNome("Teleporte");
				hab1.setPoder("Teleportar para vários lugares num raio de 100m");

				System.out.println(nome + " criado com sucesso!");
				scanner.close();
				break;
		
			case "2":
				Fada fada1  = new Fada();
				System.out.println("Digite o nome do seu personagem: ");
				String nome_fada = scanner.nextLine();
				fada1.setNome(nome_fada);

				Habilidade hab_fada = new Habilidade();
				hab_fada.setNome("Animalização");
				hab_fada.setPoder("Se tranforma em algum animal");

				System.out.println(nome_fada + " criado com sucesso!");
				scanner.close();

				
				
			default:
				break;
			
			
		}

	}
	

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Habilidade habNova = new Habilidade();
		habNova.setNome("fogo");
		habNova.setPoder("atacar inimigos com fogo");
		
		Habilidade habNova2 = new Habilidade();
		habNova2.setNome("danca marcial");
		habNova2.setPoder("dançar para enganar os inimigos");
		
		Habilidade habTeia = new Habilidade();
		habTeia.setNome("teia");
		habTeia.setPoder("jogar teia que gruda nos pr�dios");
			
		Monstro m1 = new Monstro();
		m1.setNome("Godzilla");
		m1.setRaca("lagarto");
		m1.adicionarHabilidade(habTeia);
		
		
		// Personagem p1 = new Personagem();
		
		// Personagem p2 = new Personagem("Homem-aranha","hibrido",habTeia);
		
		// Personagem p = new Personagem("Hulk","Monstro");
		// System.out.println(p.getNome());
		// p.adicionarHabilidade(habNova);
		// p.adicionarHabilidade(habNova2);
		
		
		// System.out.println(p.getPoderes());


			
	

		System.out.println("Bem vindo ao jogo épico!");

		//Laço principal do programa 
		while (true) {

			System.out.println("------------------------MENU------------------------------");
			System.out.println("1 - Crie o seu usuário");
			System.out.println("2 - Começar o jogo!");
			System.out.println("3 - Sair");
			System.out.println("----------------------------------------------------------");

			String op  = scanner.nextLine();
			switch (op) {
				case "1":
					criarPersonagem();
					break;
				case "2":	
					
					break;
				case "3":
					scanner.close();
					break;
			
				default:
					System.out.println("Por favor selecione um opção válida!");
			}
		}

	}


}
