
package Eventos;

/**
 * A classe IngressoFamilia representa um tipo especial de ingresso para
 * famílias, oferecendo desconto quando há 4 ou mais espectadores. Esta classe
 * estende a classe Bilheteria e adiciona lógica para cálculo de desconto e
 * exibição das informações do ingresso.
 * 
 * @author Geraldo Aguiar
 * @since 4/2025
 */
public class IngressoFamilia extends Bilheteria {

	private int espectadores; // Quantidade de pessoas que comprarão o ingresso
	private double valorComDesconto; // Valor com desconto aplicado (caso aplicável)

	// Legendas para exibição de informações do ingresso
	private String[] legendas = { "Filme", "Áudio", "Tipo" };

	// Valores escolhidos herdados da classe Bilheteria
	private String[] escolhidos = { super.getNomeFilme(), super.getAudio(), super.getTipoDeIngresso() };

	/**
	 * Construtor da classe IngressoFamilia.
	 * 
	 * @param nomeFilme      Nome do filme
	 * @param audio          Tipo de áudio (ex: dublado, legendado)
	 * @param tipoDeIngresso Tipo de ingresso (ex: inteira, meia)
	 * @param espectadores   Número de espectadores
	 */
	public IngressoFamilia(String nomeFilme, String audio, String tipoDeIngresso, int espectadores) {
		super(nomeFilme, audio, tipoDeIngresso); // Chamada ao construtor da superclasse
		setEspectadores(espectadores);

		// Define o valor com desconto com base no valor original
		EstipularValorIngressoFamilia(super.getValorIngresso());

		// Exibe as informações formatadas do ingresso
		Imprimindo(getEspectadores());
	}

	/**
	 * Aplica um desconto de 5% no valor do ingresso. Este método é chamado apenas
	 * quando há 4 ou mais espectadores.
	 * 
	 * @param valorIngresso Valor original do ingresso
	 */
	public void EstipularValorIngressoFamilia(double valorIngresso) {
		setValorComDesconto(getValorIngresso() - (getValorIngresso() * 0.05));
	}

	/**
	 * Exibe na tela os detalhes do ingresso e o valor total com ou sem desconto,
	 * dependendo da quantidade de espectadores.
	 * 
	 * @param espectadores Quantidade de espectadores
	 */
	void Imprimindo(int espectadores) {
		setEspectadores(espectadores);

		System.out.println("========== INGRESSO ==========\n");

		// Exibe as informações principais: nome do filme, áudio e tipo de ingresso
		for (int i = 0; i < 3; i++) {
			System.out
					.println("============" + legendas[i] + "============\n\n" + "   ******* " + escolhidos[i] + "\n");
		}

		System.out.println("===VALOR INGRESSO UNITÁRIO===\n");
		System.out.println("   ********  R$ " + super.getValorIngresso());

		System.out.println("\n** Acima de 3 pessoas, desconto de 5%. \n".toUpperCase());

		System.out.println("===NÚMERO DE PESSOAS===\n");
		System.out.println("   ********   " + getEspectadores());

		// Cálculo e exibição do valor total a pagar
		if (getEspectadores() >= 4) {
			System.out.println("\n======= TOTAL A PAGAR ========\n");
			System.out.println("   ********  R$ " + getValorComDesconto() * getEspectadores());
		} else {
			System.out.println("\n======= TOTAL A PAGAR ========\n");
			System.out.println("   ********  R$ " + getValorIngresso() * getEspectadores());
		}

		System.out.println("\n######## BOM FILME ! ########");
	}

	/**
	 * Retorna o número de espectadores.
	 * 
	 * @return número de espectadores
	 */
	public int getEspectadores() {
		return espectadores;
	}

	/**
	 * Define o número de espectadores.
	 * 
	 * @param espectadores Número de espectadores
	 */
	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}

	/**
	 * Retorna o valor do ingresso com desconto.
	 * 
	 * @return valor com desconto
	 */
	public double getValorComDesconto() {
		return valorComDesconto;
	}

	/**
	 * Define o valor do ingresso com desconto.
	 * 
	 * @param valorComDesconto Novo valor com desconto
	 */
	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}
}
