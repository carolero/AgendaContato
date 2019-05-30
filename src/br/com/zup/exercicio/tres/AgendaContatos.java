package br.com.zup.exercicio.tres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaContatos {

	public static void main(String[] args) {
		
		// Iniciando o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Criando lista
		List<Contato> contatos = new ArrayList<Contato>();
		
		int contatosTotais = 0;
		
		int controlePrincipal = 1;
		
		while (controlePrincipal == 1) {
			// Opções
			System.out.println("Digite:");
			System.out.println("1 para criar um contato");
			System.out.println("2 para buscar um telefone pelo nome do contato");
			System.out.println("3 para apagar um contato");
			int escolha = scan.nextInt();
			
			// Validando opções
			if (escolha == 1) {
				Scanner entradaContato = new Scanner(System.in);
				
				// Controle
				int controle = 1;
				
				while (controle == 1) {
					// CRIANDO CONTATO
					System.out.println("Nome do contato: ");
					String nome = entradaContato.nextLine();
					
					System.out.println("Qual o numero do contato?");
					String telefone = entradaContato.nextLine();
					
					Contato novoContato = new Contato(nome, telefone);	
					
					contatos.add(novoContato);
										
					contatosTotais++;
					
					System.out.println("Você tem " + contatosTotais + " contato/s salvo/s em sua lista.");
					
					System.out.println("Para adicionar mais um contato digite 1, para encerrar digite 0");
					controle = scan.nextInt();
					
					// Teste para confirmar a criação de contato
					for (Contato contato : contatos) {
						System.out.println(contato);
					}
					
				}
				
			} else if (escolha == 2) {
				// PROCURAR CONTATO
				Scanner entradaProcura = new Scanner(System.in);
				
				System.out.println("Qual contato quer procurar?");
				String procura = entradaProcura.nextLine();
				
				int indice = procurarIndice(procura, contatos);

				String resultado = contatos.get(indice).getTelefone();
				System.out.println(resultado);
				
				
			} else if (escolha == 3) {
				// APAGAR CONTATO
				Scanner entradaRemovendo = new Scanner(System.in);
				String remover = "";
				
				System.out.println("Qual contato quer apagar?");
				remover = entradaRemovendo.nextLine();
				
				int indice = procurarIndice(remover, contatos);
				
				contatos.remove(indice);
				System.out.println("Contato apagado com sucesso");
				
				contatosTotais--;
				
				System.out.println("Agora sua lista tem " + contatosTotais + " contato/s.");				
				
				// Teste para confirmar a remoção
//				for (Contato contato : contatos) {
//					System.out.println(contato);
//				}
				
			} else {
				System.out.println("Opção inválida.");
			}
			
			System.out.println("Se deseja retornar ao menu de opções inicial digite 1 ou 0 para sair");
			Scanner novaOpcao = new Scanner(System.in);
			controlePrincipal = novaOpcao.nextInt();
			
		}
		
	}
	
	public static int procurarIndice(String nome, List<Contato> contatos) {
		int posicao = 0;
		
		for (Contato object : contatos) {
			if(object.getNome().equalsIgnoreCase(nome)) {
				posicao = contatos.indexOf(object);
			}
		}
				
		return posicao;		
		
	}

}
