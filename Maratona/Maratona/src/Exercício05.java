
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Exercício05 {



    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Scanner Num = new Scanner(System.in);
        
        int X;
        do {
            
        
        String sn = tecla.nextLine();
        
        switch(sn) {
            case ("0"):
                X = 10;
                break;
            default:
            X = 0;
        }
        
        if (X == 0) {        
        String[] aux = sn.split(" ");
        
        
        int sala = parseInt(aux[0]);
        int N = parseInt(aux[1]);
        
        int n[] = new int[N];
        char s[] = new char[sala];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = Num.nextInt();
        }
        
        for (int i = 0; i < s.length; i++) {
            s[i] = 'D';
        }
        
        for (int i = 0; i < n.length; i++) {
            for (int j = n[i] - 1; j < s.length; j += n[i]) {
                switch (s[j]) {
                    
                    case('D'): 
                            s[j] = 'L';
                            break;
                    case('L'):
                            s[j] = 'D';
                            break;
             
            }
            
        }
        
    }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            
        }
                System.out.println(" ");
        }
    } while (X == 0);
    
}
}
