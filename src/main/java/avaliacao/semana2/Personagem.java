package avaliacao.semana2;

import java.util.Random;

public abstract class Personagem {
	
	private Random r = new Random();
	
	private String nome;
	private int maxHp;
	private int hp;
	private int ataque;
	private int defesa;
	
	protected Personagem(String nome, int maxHp, int ataque, int defesa) {
		this.nome = nome;
		this.maxHp = maxHp;
		this.hp = maxHp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getHp() {
		return hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public String getNome() {
		return nome;
	}
	
	public void batalhar(Personagem inimigo) throws PersonagemDerrotadoException {
		
		while(this.hp > 0) {
			try {
				atacar(inimigo);	 
			} catch (PersonagemDerrotadoException e) {
				System.out.println(e.getMessage());
				break;
			}

			inimigo.atacar(this);

			try{
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void atacar(Personagem inimigo) throws PersonagemDerrotadoException {
		int rolagemAtaque = r.nextInt(7) + getAtaque();
		System.out.println(String.format("%s (%s) ataca %s (%s)",
				this.getNome(), rolagemAtaque, inimigo.getNome(), inimigo.getDefesa()));
		if (rolagemAtaque > inimigo.getDefesa()) {
			inimigo.hp -= rolagemAtaque - inimigo.getDefesa();
			if(inimigo.hp <= 0) {
				throw new PersonagemDerrotadoException(inimigo, this);
			}
			System.out.println(String.format("\tAcertou! Vida atual: %s/%s", inimigo.getHp(), inimigo.getMaxHp()));
		} else {
			System.out.println("\tErrou!");
		}
	}

}
