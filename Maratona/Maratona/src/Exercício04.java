import java.util.Scanner;
public class Exerc�cio04 {

	public static void main(String[] args) {
		Scanner D = new Scanner(System.in);
		String linha;
		int jogo[][] = new int[3][3];
		String aux[];
		boolean rep = true;
		
		while (rep) {
		for (int i = 0; i < 3; i++) {
			linha = D.nextLine();
			aux = linha.split(" ");
			for (int j = 0; j < 3; j++) {
				if (aux.length == 3) {
				jogo[i][j] = Integer.parseInt(aux[j]);
				} else {
					i = 3;
					j = 3;
					rep = false;
				}
			}
		}
		
		if (rep) {
		
		if (jogo[0][0] + jogo[0][1] + jogo[0][2] == 3) {
			System.out.println("X");
		} else if (jogo[0][0] + jogo[0][1] + jogo[0][2] == -3) {
			System.out.println("O");
		} else if (jogo[1][0] + jogo[1][1] + jogo[1][2] == 3) {
			System.out.println("X");
		} else if (jogo[1][0] + jogo[1][1] + jogo[1][2] == -3) {
			System.out.println("O");
		} else if (jogo[2][0] + jogo[2][1] + jogo[2][2] == 3) {
			System.out.println("X");
		} else if (jogo[2][0] + jogo[2][1] + jogo[2][2] == -3) {
			System.out.println("O");
		} else if (jogo[0][0] + jogo[1][0] + jogo[2][0] == 3) {
			System.out.println("X");
		} else if (jogo[0][0] + jogo[1][0] + jogo[2][0] == -3) {
			System.out.println("O");
		} else if (jogo[0][1] + jogo[1][1] + jogo[2][1] == 3) {
			System.out.println("X");
		} else if (jogo[0][1] + jogo[1][1] + jogo[2][1] == -3) {
			System.out.println("O");
		} else if (jogo[0][2] + jogo[1][2] + jogo[2][2] == 3) {
			System.out.println("X");
		} else if (jogo[0][2] + jogo[1][2] + jogo[2][2] == -3) {
			System.out.println("O");
		} else if (jogo[0][0] + jogo[1][1] + jogo[2][2] == 3) {
			System.out.println("X");
		} else if (jogo[0][0] + jogo[1][1] + jogo[2][2] == -3) {
			System.out.println("O");
		} else if (jogo[2][0] + jogo[1][1] + jogo[0][2] == 3) {
			System.out.println("X");
		} else if (jogo[2][0] + jogo[1][1] + jogo[0][2] == -3) {
			System.out.println("O");
		} else {
			System.out.println("Empate");
		}
		}
	}
	}
}
