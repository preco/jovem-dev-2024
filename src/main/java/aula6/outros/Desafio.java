package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

/**
 * Crie uma classe chamada Evento que vai possuir descricao (String), dataHora
 * (LocalDateTime) e tipo de evento (enum). Os eventos podem ser categorizados
 * em SOCIAL, LAZER, PROFISSIONAL e OUTROS. Crie alguns eventos Em seguida peça
 * para o usuário digitar um tipo de evento e agrupe os eventos daquele tipo em
 * duas categorias: eventos que já ocorreram e eventos que ainda não ocorreram.
 */
public class Desafio {

	public static void main(String[] args) {
		List<Evento> lista = new ArrayList<>();
		lista.add(new Evento("Futebol", LocalDateTime.of(2024, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		
		lista.add(new Evento("Volei", LocalDateTime.of(2024, 9, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Festa", LocalDateTime.of(2024, 10, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		
		lista.add(new Evento("Reuniao", LocalDateTime.of(2024, 6, 6, 12, 0, 0), TipoEventoEnum.PROFISSIONAL));
		lista.add(new Evento("Evento privado", LocalDateTime.of(2024, 8, 3, 12, 0, 0), TipoEventoEnum.OUTROS));

		String input = JOptionPane.showInputDialog("Digite um evento");
		TipoEventoEnum tipo = TipoEventoEnum.valueOf(input);
		
		Map<Boolean, List<Evento>> mapa = lista
				.stream()
				.filter(e -> e.getTipo().equals(tipo))
				.collect(Collectors.groupingBy(e -> e.getData().isBefore(LocalDateTime.now())));
		
		System.out.println("Eventos que já ocorreram");
		System.out.println(mapa.get(true));
		
		System.out.println("Eventos que ainda não ocorreram");
		System.out.println(mapa.get(false));
		
	}

}
