package atividade1610;

public class BibliotecaXPTO {

	public static void main(String[] args) {
		
		Publicacao[] publicacoes = new Publicacao[2];
		
		Livro livro1 = new Livro(
				"Pequeno Principe",
				"Antoine de Saint-Exupéry",
				1943,
				"fabula",
				"xpto",
				10,
				1,
				"13564586");
		publicacoes [0] = livro1;
		
		Filme filme1 = new Filme(
				"Interestelar",
				"Fulano",
				2016,
				"Ficçao Cientifica",
				"HBO",
				15,
				"Cristofer",
				"Vin Diesel",
				"As reservas naturais da Terra"
				+ " estão chegando ao fim e um grupo"
				+ " de astronautas recebe a missão de"
				+ " verificar possíveis planetas para"
				+ " receberem a população mundial,"
				+ " possibilitando a continuação da espécie.",
				120);
		publicacoes [0] = filme1;
		
		for(Publicacao p : publicacoes) {
			p.imprimirDados();
			System.out.println();
		}
		/** resposta V) foi Foi possível adicionar objetos do tipo 
		 * Livro e Filme no array de Publicacao devido ao conceito de polimorfismo 
		 * permitindo que um objeto de uma classe específica seja tratado 
		 * como um objeto de sua classe pai, ou seja, uma instância de uma 
		 * subclasse pode ser tratada como uma instância da superclasse.
		 */
		
		/**
		 * resposta VI)embora seja declarado como abstrato na classe Publicacao, 
		 * as subclasses Livro e Filme são obrigadas a fornecer uma implementação para esse método.
		 *  Então quando o loop é executado, ele chama o método imprimirDados 
		 *  específico para cada tipo de publicação,
		 */
	
		
	}

}
