package entities;

public class Pessoas {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
}

