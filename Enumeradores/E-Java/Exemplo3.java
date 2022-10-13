package Enumeradores;

public class Exemplo3 {

	public static void main(String[] args) {
		/*
		 * O método values() do Enum, todo enum criado contém esse método, ele retorna
		 * um array de todos os valores que há dentro do numerador.
		 */
		DiaSemana2[] dias = DiaSemana2.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println("=========");
		for (DiaSemana2 diaSemana2 : DiaSemana2.values()) { // colocando dias depois dos : pega tb
			System.out.println(diaSemana2);
		}
	}

}
