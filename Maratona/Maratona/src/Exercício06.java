import java.util.Scanner;

public class Exerc�cio06 {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        int func[] = new int [3];        
        int menor = 0;       
        int tempo[] = new int [3];
        boolean rep = true;
        
        do {
        
        for (int i = 0; i < func.length; i++) {
            func[i] = num.nextInt();
            if (func[0] == 0) {
            	i = func.length;
            	rep = false;
            }
        }
        
        if (rep) {
        
        for (int i = 0; i < func.length; i++) {
        	tempo[i] = 0;
            for (int j = 0; j < func.length; j++) {
            	int dif = j - i;
            	if (dif < 1) {
            		dif = dif * -1;
            	}
            		tempo[i] += func[j] * (dif * 2);
            	
            }
        }
        
        menor = tempo[0];
        
        for (int i = 0; i < tempo.length; i++) {
			if (menor > tempo[i]) {
				menor = tempo[i];
			}
		}
        
        System.out.println(menor);
        
        }
        
        } while (rep);
    }
    
}