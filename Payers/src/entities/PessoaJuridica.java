package entities;

public class PessoaJuridica {
	private String nome;
	private Double rendaAnual;
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public Double totalTax() {
		Double totalTax;
		if(numeroFuncionarios < 10) {
			totalTax = rendaAnual * 16/100;
		}
		else {
			totalTax = rendaAnual * 14/100;
		}
		return totalTax;
	}
	
	public String toString() {
		return nome + ": " + "$" + totalTax();
	}
}
