package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça ao usuário para digitar uma data (formato
 * dd/MM/yyyy) e mostre o dia da semana em que essa data caiu. Para os fins
 * desse programa, o dia da semana pode ser em inglês.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		String dataString = JOptionPane.showInputDialog("Digite uma data (dd/mm/aaaa):");
		LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("A data " + dataString + " foi " + data.getDayOfWeek());
		
		//para exibir em português
		System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-br")));	

	}

}
