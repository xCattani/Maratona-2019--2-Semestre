import java.util.Scanner;

public class Exercício01 {
	public static void main(String[] args) {
		
		Scanner pa = new Scanner(System.in);
		Scanner jog = new Scanner(System.in);
		int J;

                
		int h = 0;
		while (h == 0) {

                int JiloR = 0;
                int FerrugemR = 0;
		int palito = 0;
		
		J = jog.nextInt();
		String linha[] = new String[J];
		
		if (J == 0) {
			h = 1;
		} else {
		for (int i = 0; i < linha.length; i++) {
		palito = 0;
			linha[i] = pa.nextLine();
			int partida[] = new int[J];
			
			String aux[] = linha[i].split(" ");
			
                        
                    
			for (int j = 0; j < 2; j++) {
                            if (aux[j] == "lona") {
                                
                            } else {
						char[] Aux = aux[j].toCharArray();
						
						for (int k = 0; k < Aux.length; k++) {
							if (Aux[k] == 'I') {
								palito += 1;
							}
						}
                            }
                        }
			int Jilo;
			switch (aux[2]) {
			case "lona":
				Jilo = 0;
				break;
			default:
				Jilo = Integer.parseInt(aux[2]);
				break;
			}
			
			int Ferrugem;
			switch (aux[3]) {
			case "lona":
				Ferrugem = 0;
				break;
			default:
				Ferrugem = Integer.parseInt(aux[3]);
				break;
			}
			
			if (Jilo == palito) {
				JiloR += 1;
			}
                        if (Ferrugem == palito) {
				FerrugemR += 1;
			}
         		
		}
                
                if(JiloR > FerrugemR) {
                    System.out.println("Jilo");
                }
                if (FerrugemR > JiloR) {
                    System.out.println("Ferrugem");
                }
                if (JiloR == FerrugemR) {
                    System.out.println("Empate");
                }
		}
                JiloR = 0;
                FerrugemR = 0;
		} 
	}
}

