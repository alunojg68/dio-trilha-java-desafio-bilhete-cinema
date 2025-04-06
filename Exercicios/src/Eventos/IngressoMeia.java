
package Eventos;

import java.text.Format;

/**
 * A classe IngressoMeia representa um tipo de ingresso com meia-entrada, ou
 * seja, o valor do ingresso é reduzido pela metade. Essa classe estende a
 * classe Bilheteria, herdando suas propriedades básicas.
 * 
 * Ideal para estudantes, idosos ou beneficiários de meia-entrada.
 * 
 * @author Geraldo Aguiar
 * @since 4/2025
 */
public class IngressoMeia extends Bilheteria {

	private double valorIngressoMeia; // Armazena o valor do ingresso com 50% de desconto
	private String mudaValor; // Representação em texto do valor do ingresso com desconto
	

	// Legendas para exibição das informações do ingresso
	private String[] legendas = { "Filme", "Áudio", "Tipo" };

	// Informações do ingresso herdadas da superclasse
	private String[] escolhidos = { super.getNomeFilme(), super.getAudio(), super.getTipoDeIngresso() };

	/**
	 * Construtor da classe IngressoMeia. Inicializa o ingresso com os dados
	 * informados e aplica o desconto de meia-entrada.
	 * 
	 * @param nomeFilme      Nome do filme
	 * @param audio          Tipo de áudio (ex: dublado, legendado)
	 * @param tipoDeIngresso Tipo de ingresso (ex: meia, inteira)
	 */
	public IngressoMeia(String nomeFilme, String audio, String tipoDeIngresso) {
		super(nomeFilme, audio, tipoDeIngresso); // Chamada ao construtor da superclasse

		// Aplica o desconto de 50% no valor original
		EstipularValorIngressoMeia(super.getValorIngresso());

		// Armazena o valor final formatado como string
		mudaValor = Double.toString(getValorIngressoMeia());

		// Exibe os detalhes do ingresso
		Imprimindo();
	}

	/**
	 * Define o valor do ingresso como metade do valor original.
	 * 
	 * @param valorIngresso Valor original do ingresso
	 */
	public void EstipularValorIngressoMeia(double valorIngresso) {
		setValorIngressoMeia(getValorIngresso() / 2);
	}

	/**
	 * Exibe no console os detalhes do ingresso com meia-entrada, incluindo filme,
	 * áudio, tipo e o valor final a pagar.
	 */
	void Imprimindo() {
		System.out.println("========== INGRESSO ==========\n");

		// Exibe as informações principais do ingresso
		for (int i = 0; i < 3; i++) {
			System.out
					.println("============" + legendas[i] + "============\n\n" + "   ******* " + escolhidos[i] + "\n");
		}

		// Valor original do ingresso (inteira)
		System.out.println("===VALOR INGRESSO UNITÁRIO===\n");
		System.out.println("   ********  R$ " + super.getValorIngresso());

		// Valor com meia-entrada
		System.out.println("\n======= TOTAL A PAGAR ========\n");
		System.out.println("   ********  R$ " + mudaValor);

		System.out.println("\n######## BOM FILME ! ########");
	}

	/**
	 * Retorna o valor do ingresso com o desconto de meia-entrada.
	 * 
	 * @return Valor com desconto aplicado
	 */
	public double getValorIngressoMeia() {
		return valorIngressoMeia;
	}

	/**
	 * Define o valor do ingresso com meia-entrada.
	 * 
	 * @param valorIngressoMeia Novo valor com desconto
	 */
	public void setValorIngressoMeia(double valorIngressoMeia) {
		this.valorIngressoMeia = valorIngressoMeia;
	}
}
