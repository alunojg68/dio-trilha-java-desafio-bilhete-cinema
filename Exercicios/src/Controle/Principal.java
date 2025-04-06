package Controle;

import Eventos.IngressoFamilia;
import Eventos.IngressoMeia;
import Eventos.Toten;

public class Principal {

	public static void main(String[] args) {

		Toten t = new Toten();

		if (t.getEscolheIngresso() == "MEIA") {

			IngressoMeia im = new IngressoMeia(t.getEscolhaFilme(), t.getEscolhaAudio(), t.getEscolheIngresso());

		} else {

			IngressoFamilia im = new IngressoFamilia(t.getEscolhaFilme(), t.getEscolhaAudio(), t.getEscolheIngresso(),
					t.getEspectadores());

		}
	}
}
