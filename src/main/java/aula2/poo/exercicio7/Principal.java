package aula2.poo.exercicio7;

/**
 * Crie uma classe chamada NotaFiscal, que conterá os atributos "emitente" e
 * "valor". Crie um método de objeto chamado "calculaValor" que receberá o preço
 * bruto do produto e o valor do desconto e armazenará o cálculo no atributo
 * valor. Por motivos de segurança, o atributo valor não pode ser modificado
 * fora dessa função. Na classe principal, crie duas notas fiscais e chame o
 * método calculaValor de cada uma, passando valores arbitrários.
 */
public class Principal {

	public static void main(String[] args) {
		NotaFiscal nf1 = new NotaFiscal();
		NotaFiscal nf2 = new NotaFiscal();

		nf1.setEmitente("Farmacia 1");
		nf2.setEmitente("Farmacia 2");
		//nao ha .setValor
		nf1.calculaValor(100.0, 20.0);
		nf2.calculaValor(50.0, 0.0);
		
		System.out.println(nf1);
		System.out.println(nf2);
	}

}
