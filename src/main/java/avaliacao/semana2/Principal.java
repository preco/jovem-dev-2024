package avaliacao.semana2;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	public Principal() {
		Personagem b = new Mago();
		
		try {
			b.batalhar(new Morcego());
			b.batalhar(new Zumbi());
			b.batalhar(new Urso());
			b.batalhar(new Vampiro());
			b.batalhar(new Arok());
			
			System.out.println("VOCÊ VENCEU AROK!");
		} catch (PersonagemDerrotadoException e) {
			e.printStackTrace();
		}
		
	}

}
