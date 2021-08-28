package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int func = sc.nextInt();
		for(int i= 0; i<func; i++) {
			System.out.print("Pessoa fisica ou jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Rendimento anual: ");
			Double rendimento = sc.nextDouble();
			if (tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				PessoaFisica pf = new PessoaFisica(nome, rendimento, gastosSaude);
				list.add(pf);
				}
			else if(tipo == 'j') {
				System.out.print("Número de funcionários");
				int funcionarios =  sc.nextInt();
				PessoaJuridica pj = new PessoaJuridica(nome, rendimento, funcionarios);
				list.add(pj);
				}
			}
		
		System.out.println();
		
		double soma = 0;
		
		System.out.println("Impostos pagos:");
		for(Contribuinte contribuinte : list) {
			double impostos = contribuinte.impostos();
			System.out.println(contribuinte.getNome() + " $" + String.format("%.2f", impostos));
			
			soma+=impostos;
		}
		
		System.out.println("Total de Impostos: $" + soma);		
		sc.close();
	}

}
