package avaliacao.semana2;

public class PersonagemDerrotadoException extends Exception {

	private static final long serialVersionUID = 320578045706458109L;

	public PersonagemDerrotadoException(Personagem morto, Personagem inimigo) {
		super(String.format("%s foi derrotado por %s", morto.getNome(), inimigo.getNome()));
	}
}
