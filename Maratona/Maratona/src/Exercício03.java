import java.util.Scanner;

public class Exerc�cio03 {
	
	private static Scanner sc;

	public static void main(String[] args) {
	    
		sc = new Scanner(System.in);
		
		char Alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' ,'L',
	    		   'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	    
	    char Cript[] =    {'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
	    		   'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C'};
	    
	    System.out.println("Digite um texto MAI�SCULO:");
	    
	    String texto;
	    
	    boolean rep;
	    
	    do {
			
	    	texto = sc.nextLine();
	    	
	    	char[] parar = texto.toCharArray();
	    	if (parar[0] == '0') {
				rep = false;
			} else {
				rep = true;
			}
	    	if (rep) {
				char[] div = texto.toCharArray();
				
				for (int i = 0; i < div.length; i++) {

					for (int j = 0; j < Cript.length; j++) {
						
						if (div[i] == Cript[j]) {
							
							div[i] = Alfabeto[j];
							j = Cript.length;
							
						}
							
						}
						
					}
				for (int i = 0; i < div.length; i++) {
					
					System.out.print(div[i]);
					
				}	
				System.out.println(" ");
				}
			

		} while (rep);
	    
	    
	    
	    
	}
}
