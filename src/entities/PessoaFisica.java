package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double redimentoAnual, Double gastosSaude) {
		super(nome, redimentoAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double impostos() {
		if(getRedimentoAnual()<20000) {
		return  getRedimentoAnual()* .15 - gastosSaude * .5;
		}
		else
			return getRedimentoAnual() * .25 - gastosSaude * .5;		
	}

}
