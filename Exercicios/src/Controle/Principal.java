
package Controle;

import Eventos.IngressoFamilia;
import Eventos.IngressoMeia;
import Eventos.Toten;

/**
 * Classe Principal que contém o método main, responsável por iniciar o
 * programa. Realiza a interação com o usuário através do Toten e cria o tipo de
 * ingresso apropriado com base na escolha feita (Meia ou Família).
 */
public class Principal {

	public static void main(String[] args) {

		// Instancia o terminal de autoatendimento (Toten)
		Toten t = new Toten();

		// Verifica se o tipo de ingresso escolhido foi "MEIA"
		// IMPORTANTE: Comparação de strings deve usar .equals() em Java!
		if (t.getEscolheIngresso().equals("MEIA")) {
			// Cria um ingresso do tipo meia-entrada
			IngressoMeia im = new IngressoMeia(t.getEscolhaFilme(), // Filme escolhido
					t.getEscolhaAudio(), // Tipo de áudio
					t.getEscolheIngresso() // Tipo de ingresso (MEIA)
			);
		} else {
			// Cria um ingresso do tipo família, com número de espectadores
			IngressoFamilia im = new IngressoFamilia(t.getEscolhaFilme(), // Filme escolhido
					t.getEscolhaAudio(), // Tipo de áudio
					t.getEscolheIngresso(), // Tipo de ingresso (FAMÍLIA)
					t.getEspectadores() // Número de pessoas
			);
		}
	}
}
