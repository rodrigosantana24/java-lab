package entities;

public class PessoaFisica {
	private String nome;
	private Double rendaAnual;
	private Double gastoSaude;
	
	public PessoaFisica(){
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastoSaude = gastoSaude;
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

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public Double totalTax() {
		Double totalTax;
		if(rendaAnual < 20000.00) {
			totalTax = (rendaAnual * 15/100) - (gastoSaude * 50/100);
		}
		else {
			totalTax = (rendaAnual * 25/100) - (gastoSaude * 50/100);
		}
		return totalTax;
	}
	
	public String toString() {
		return nome + ": " + "$" + totalTax();
	}
}
