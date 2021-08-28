package entities;

public abstract class Contribuinte {
	private String nome;
	private Double redimentoAnual;
	
	public Contribuinte() {
	}

	public Contribuinte(String nome, Double redimentoAnual) {
		this.nome = nome;
		this.redimentoAnual = redimentoAnual;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRedimentoAnual() {
		return redimentoAnual;
	}

	public void setRedimentoAnual(Double redimentoAnual) {
		this.redimentoAnual = redimentoAnual;
	}

	public abstract Double impostos();
}
