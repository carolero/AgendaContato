package br.com.zup.exercicio.tres;

public class Contato {
	
	// Atributos
	private String nome;
	private String telefone;
	
	// Construtor
	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Método toString
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + this.getNome() + "\n";
		modelo += "Telefone -> " + this.getTelefone() + "\n";
		
		return modelo;
	}
	
}
