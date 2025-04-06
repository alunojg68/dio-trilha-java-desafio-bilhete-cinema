package Eventos;

public class Bilheteria {

	public Bilheteria(String nomeFilme, String audio, String tipoDeIngresso) {

		this.NomeFilme = nomeFilme;
		this.Audio = audio;
		this.tipoDeIngresso = tipoDeIngresso;

	}

	private String tipoDeIngresso;

	public String getTipoDeIngresso() {

		return tipoDeIngresso;
	}

	public void setTipoDeIngresso(String tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;

	}

	private String NomeFilme;

	public String getNomeFilme() {
		return NomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		NomeFilme = nomeFilme;
	}

	public String getAudio() {
		return Audio;
	}

	public void setAudio(String audio) {
		Audio = audio;
	}

	private String Audio;

	private double valorIngresso = 30.0;

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
}
