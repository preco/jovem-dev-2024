package dinamica;

import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		AnaliseDados analise = new AnaliseDados();
		System.out.println("10 maiores salários da empresa");
		System.out.println(analise
			.obtemDezMaioresSalarios(CargaDados.getListaFuncionarios())
			.stream()
			.map(Funcionario::toString)
			.collect(Collectors.joining("\n\t", "\t", "")));
		
		System.out.println("\nQual a média de salário por cargo?");
		
		System.out.println(analise
				.obtemMediaSalarioPorCargo(CargaDados.getListaFuncionarios())
				.entrySet()
				.stream()
				.map(e -> String.format("%s: R$%.2f", e.getKey(), e.getValue()))
				.collect(Collectors.joining("\n\t", "\t", ""))
				);
		
		System.out.println("\nQual seria o impacto, em reais, de oferecer um reajuste de 10% a todos os funcionários?");
		System.out.println(String.format("\tR$%.2f", analise.obtemImpactoReajuste(CargaDados.getListaFuncionarios())));
		
		System.out.println("\nQual o percentual de cada cargo em relação ao total de funcionários?");
		System.out.println(analise
				.obtemPercentualFuncionarios(CargaDados.getListaFuncionarios())
				.entrySet()
				.stream()
				.map(e -> String.format("%s: %.3f%%", e.getKey(), e.getValue()))
				.collect(Collectors.joining("\n\t", "\t", ""))
				);
		
		System.out.println("\nQual o menor salário, o maior salário, a média, a moda e a mediana de salário por cargo?");
		System.out.println(analise
				.obtemEstatisticas(CargaDados.getListaFuncionarios())
				.entrySet()
				.stream()
				.map(e -> String.format("%s: %s", e.getKey(), e.getValue()))
				.collect(Collectors.joining("\n\t", "\t", "")));
		
		System.out.println("\nQual departamento possui o maior orçamento?");
		System.out.println(String.format("\t%s", analise.obtemDepartamentoMaiorOrcamento(CargaDados.getListaFuncionarios())));
		
		System.out.println("\nQual departamento possui a maior média salarial?");
		System.out.println(String.format("\t%s", analise.obtemMaiorMediaSalarial(CargaDados.getListaFuncionarios())));
	}

}
