package Eventos;

import java.util.Scanner;

public class Toten {
	private String escolhaAudio;
	private String escolhaFilme;
	private String escolheIngresso;
	int tipoIngresso;
	int filme;
	int audio;
	private int espectadores;

	public Toten() {

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("*******ESCOLHA INGRESSO*******\n");
			System.out.println("    Digite 1 -  MEIA");
			System.out.println("    Digite 2 - FAMÍLIA");
			tipoIngresso = sc.nextInt();

			switch (tipoIngresso) {
			case 1: {
				setEscolheIngresso("MEIA");

				break;

			}
			case 2: {

				setEscolheIngresso("FAMÍLIA");
				do {
					System.out.println("*******ESPECTADORES*******\n");
					System.out.println("Digite número de pessoas: ");
					espectadores = sc.nextInt();
					setEspectadores(espectadores);
					if (espectadores <= 0)
						System.out.println(" VALOR INVÁLIDO: " + espectadores);
				} while (espectadores <= 0);

				break;

			}
			default:
				System.out.println(" VALOR INVÁLIDO: " + tipoIngresso);
			}

		} while (tipoIngresso < 1 || tipoIngresso >= 3);

		do {
			System.out.println("**********FILMES EM CARTAZ***********\n");
			System.out.println("     Digite 1 -    BEN-HUR");
			System.out.println("     Digite 2 -    FURACÃO");
			System.out.println("     Digite 3 - O EXORCISTA");
			System.out.println("     Digite 4 -OS VINGADORES\n");

			filme = sc.nextInt();

			switch (filme) {
			case 1: {

				setEscolhaFilme("BEN-HUR");

				break;
			}
			case 2: {

				setEscolhaFilme("FURACÃO");

				break;
			}
			case 3: {

				setEscolhaFilme("O EXORCISTA");

				break;
			}
			case 4: {

				setEscolhaFilme("OS VINGADORES");

				break;
			}
			default:
				System.out.println(" VALOR INVÁLIDO: " + filme);
			}

		} while (filme < 1 || filme >= 5);

		do {
			System.out.println("*************ÁUDIO**************\n");
			System.out.println("     Digite 1 -  DUBLADO");
			System.out.println("     Digite 2 - LEGENDADO");

			audio = sc.nextInt();

			switch (audio) {
			case 1: {
				setEscolhaAudio("DUBLADO");

				break;

			}
			case 2: {

				setEscolhaAudio("LEGENDADO");
				break;
			}
			default:
				System.out.println(" VALOR INVÁLIDO: " + audio);
			}

		} while (audio < 1 || audio >= 3);

		sc.close();

	}

	public String getEscolhaAudio() {
		return escolhaAudio;
	}

	public void setEscolhaAudio(String escolhaAudio) {
		this.escolhaAudio = escolhaAudio;
	}

	public String getEscolhaFilme() {
		return escolhaFilme;
	}

	public void setEscolhaFilme(String escolhaFilme) {
		this.escolhaFilme = escolhaFilme;
	}

	public String getEscolheIngresso() {
		return escolheIngresso;
	}

	public void setEscolheIngresso(String escolheIngresso) {
		this.escolheIngresso = escolheIngresso;
	}

	public int getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}

}
