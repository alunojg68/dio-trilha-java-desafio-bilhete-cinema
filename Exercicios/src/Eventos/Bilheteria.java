/*
 * package Eventos;
 * 
 * public class Bilheteria {
 * 
 * public Bilheteria(String nomeFilme, String audio, String tipoDeIngresso) {
 * 
 * this.NomeFilme = nomeFilme; this.Audio = audio; this.tipoDeIngresso =
 * tipoDeIngresso;
 * 
 * }
 * 
 * private String tipoDeIngresso;
 * 
 * public String getTipoDeIngresso() {
 * 
 * return tipoDeIngresso; }
 * 
 * public void setTipoDeIngresso(String tipoDeIngresso) { this.tipoDeIngresso =
 * tipoDeIngresso;
 * 
 * }
 * 
 * private String NomeFilme;
 * 
 * public String getNomeFilme() { return NomeFilme; }
 * 
 * public void setNomeFilme(String nomeFilme) { NomeFilme = nomeFilme; }
 * 
 * public String getAudio() { return Audio; }
 * 
 * public void setAudio(String audio) { Audio = audio; }
 * 
 * private String Audio;
 * 
 * private double valorIngresso = 30.0;
 * 
 * public double getValorIngresso() { return valorIngresso; }
 * 
 * public void setValorIngresso(double valorIngresso) { this.valorIngresso =
 * valorIngresso; } }
 */

package Eventos;

/**
 * Classe Bilheteria representa os dados comuns de um ingresso de cinema.
 * Armazena informações como nome do filme, tipo de áudio, tipo de ingresso e
 * valor do ingresso.
 */
public class Bilheteria {

	// Atributos privados da classe
	private String tipoDeIngresso; // Tipo de ingresso (ex: MEIA ou FAMÍLIA)
	private String NomeFilme; // Nome do filme selecionado
	private String Audio; // Tipo de áudio (DUBLADO ou LEGENDADO)
	private double valorIngresso = 30.0; // Valor base do ingresso

	/**
	 * Construtor da classe Bilheteria. Inicializa os atributos com os valores
	 * passados como parâmetros.
	 *
	 * @param nomeFilme      Nome do filme escolhido
	 * @param audio          Tipo de áudio (DUBLADO ou LEGENDADO)
	 * @param tipoDeIngresso Tipo de ingresso (MEIA ou FAMÍLIA)
	 */
	public Bilheteria(String nomeFilme, String audio, String tipoDeIngresso) {
		this.NomeFilme = nomeFilme;
		this.Audio = audio;
		this.tipoDeIngresso = tipoDeIngresso;
	}

	// Getters e Setters

	/**
	 * Retorna o tipo de ingresso.
	 * 
	 * @return tipoDeIngresso
	 */
	public String getTipoDeIngresso() {
		return tipoDeIngresso;
	}

	/**
	 * Define o tipo de ingresso.
	 * 
	 * @param tipoDeIngresso Tipo de ingresso (MEIA ou FAMÍLIA)
	 */
	public void setTipoDeIngresso(String tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}

	/**
	 * Retorna o nome do filme escolhido.
	 * 
	 * @return Nome do filme
	 */
	public String getNomeFilme() {
		return NomeFilme;
	}

	/**
	 * Define o nome do filme.
	 * 
	 * @param nomeFilme Nome do filme
	 */
	public void setNomeFilme(String nomeFilme) {
		this.NomeFilme = nomeFilme;
	}

	/**
	 * Retorna o tipo de áudio escolhido.
	 * 
	 * @return Tipo de áudio
	 */
	public String getAudio() {
		return Audio;
	}

	/**
	 * Define o tipo de áudio.
	 * 
	 * @param audio Tipo de áudio (DUBLADO ou LEGENDADO)
	 */
	public void setAudio(String audio) {
		this.Audio = audio;
	}

	/**
	 * Retorna o valor do ingresso.
	 * 
	 * @return valor do ingresso (padrão: 30.0)
	 */
	public double getValorIngresso() {
		return valorIngresso;
	}

	/**
	 * Define um novo valor para o ingresso.
	 * 
	 * @param valorIngresso Novo valor
	 */
	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
}
