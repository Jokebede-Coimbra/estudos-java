package Enumeradores;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usandoEnum();

	}
// A vantagem de utilizar o Enum no lugas de constantes � a seguran�a, pois o tipo do constante � int, mas n me garante se vai ser passado n�mero no lugar do "nome da semana"
	// E o Enum s� aceita os que ele especificou na classe
	
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domindo = DiaSemana.DOMINGO;

		System.out.println("Teste utilizando Enum no Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domindo);
	}

	private static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Ter�a-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("S�bado-feira");
			break;
		case DOMINGO:
			System.out.println("Domingo-feira");
			break;
		}
	}
}
