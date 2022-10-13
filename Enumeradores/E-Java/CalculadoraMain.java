package Enumeradores;

public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 8.0, y = 4.0;
		
		for (CalculadoraEnum calculadoraEnum : CalculadoraEnum.values()) {
			System.out.print(x + " ");
			System.out.print(calculadoraEnum.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(calculadoraEnum.executarOperacao(x, y));
		}
		
	}

}
