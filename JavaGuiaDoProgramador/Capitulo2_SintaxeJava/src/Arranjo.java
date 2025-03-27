import java.util.Scanner;

public class Arranjo {
    public static void main(String[] args) {
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<a.length; i++) {
            System.out.print("a[" + i + "]? " );
            a[i] = sc.nextInt();
        }
        
        int soma = 0; //Exibe arranjo e soma seus elementos.
        System.out.println("--------------------------------------");
        for(int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            soma += a[i];    
        }
        System.out.println("Soma = " + soma); //Exibe soma obtida
        sc.close();
    
    }
}
