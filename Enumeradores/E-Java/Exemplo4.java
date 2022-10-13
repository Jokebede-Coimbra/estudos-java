package Enumeradores;

public class Exemplo4 {

	public static void main(String[] args) {
		// Exemplos com valueOf
		
		System.out.println(Enum.valueOf(DiaSemana2.class,"DOMINGO"));
		
		DiaSemana2 dia = Enum.valueOf(DiaSemana2.class, "DOMINGO");
		
		System.out.println(dia);
		
	}

}
