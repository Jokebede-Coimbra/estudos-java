package matrizes;

public class MatrizesManipulacao {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " , ");
			}
			System.out.println();
		}
		
		// Manipulando
		notasAlunos[0][0] = 5;
		System.out.println();
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " , ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno: ");
		double soma = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é : " + String.format("%.2f", soma/4));
		}
		
		// vetor
		double[] notasAlunos1 = {7, 8, 9, 10}; 
		// matriz
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {6, 7, 9, 5}}; 
		
		System.out.println();
		System.out.println("Output da matriz notasAlunos2: ");
		double s = 0;
		for (int i = 0; i < notasAlunos2.length; i++) {
			
			for (int j = 0; j < notasAlunos2[i].length; j++) {
				System.out.println(notasAlunos2[i][j]);
				s += notasAlunos2[i][j];
			}
			
			System.out.println("Média do Alunos2 " + i + " é : " + String.format("%.2f", s/4));
		}
	}

}
