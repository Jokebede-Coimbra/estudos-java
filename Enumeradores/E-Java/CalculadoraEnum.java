package Enumeradores;

public enum CalculadoraEnum {
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	},
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};

	private String simbolo;

	// construtor
	private CalculadoraEnum(String simbolo) {
		this.simbolo = simbolo;
	}

	public String toString() {
		return this.simbolo;
	}

	public abstract double executarOperacao(double x, double y);
}
