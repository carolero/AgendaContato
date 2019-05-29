package br.com.zup.exercicio.tres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaContatos {

	public static void main(String[] args) {
		
		// Iniciando o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Opções
		System.out.println("Digite:");
		System.out.println("1 para criar um contato");
		System.out.println("2 para buscar um telefone pelo nome do contato");
		System.out.println("3 para apagar um contato");
		int escolha = scan.nextInt();
		
		// Criando lista
		List<String> contatos = new ArrayList<String>();
		
		int controleExterno = 1;
		
		// Validando opções
		while (controleExterno == 1) {
			if (escolha == 1) {
				Scanner entradaContato = new Scanner(System.in);
				
				// Controle
				int controle = 1;
				
				while (controle == 1) {
					System.out.println("Nome do contato: ");
					String nome = entradaContato.nextLine();
					
					System.out.println("Qual o numero do contato?");
					String telefone = entradaContato.nextLine();
					
					contatos.add(nome);
					contatos.add(telefone);
				
					for (String string : contatos) {
						System.out.println(string);
					}
					
					System.out.println("Para adicionar mais um contato digite 1, para encerrar digite 0");
					controle = scan.nextInt();
					
				}
				
			} else if (escolha == 2) {
				// PROCURAR CONTATO
				Scanner entradaProcura = new Scanner(System.in);
				
				System.out.println("Qual contato quer procurar?");
				String procura = entradaProcura.nextLine();
				
				if (contatos.contains(procura)) {
					System.out.println(contatos.indexOf(procura));
				} else {
					System.out.println("Esse contato não existe.");
				}
				
				
			} else if (escolha == 3) {
				// APAGAR CONTATO
				Scanner entradaRemovendo = new Scanner(System.in);
				String remover = "";
				
				System.out.println("Qual contato quer apagar?");
				remover = entradaRemovendo.nextLine();
				
				if (contatos.contains(remover)) {
					contatos.remove(remover);
					System.out.println("Contato removido.");

				} else {
					System.out.println("Esse contato não existe.");
				}			
				
			} else {
				System.out.println("Opção inválida.");
			}
		}
		
		
	}
		
	
	public void opcao() {
		
	}

}
