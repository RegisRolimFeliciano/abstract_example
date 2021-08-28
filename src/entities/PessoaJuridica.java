package entities;

public class PessoaJuridica extends Contribuinte {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double redimentoAnual, int numeroFuncionarios) {
		super(nome, redimentoAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double impostos() {
		if(numeroFuncionarios > 10) {
			return getRedimentoAnual() * .14;
		}
		else
			return getRedimentoAnual() * .16;
	}

}
