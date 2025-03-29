package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class ValoresCrescentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores serão lidos? ");
        int valores[] = new int[sc.nextInt()];
    
        for(int i=0; i<valores.length; i++) {
            System.out.print("\nDigite o valor " + (i+1) + ": ");
            valores[i] = sc.nextInt();
        }

        System.out.print("\nValores na ordem como foram fornecidos: [");
        for(int i=0; i<valores.length; i++) {
            if(i==valores.length-1) {
                System.out.print(valores[i]);
            } else {
                System.out.print(valores[i] + ", ");
            }
        }
        System.out.println("]");

        boolean ordemCrescente = true;
        for(int i=1; i<valores.length; i++) {
            if(valores[i] < valores[i-1]) {
                ordemCrescente = false;
                break;
            }
        }

        for(int i=0; i<valores.length-1; i++) {
            for(int j=0; j<valores.length-1; j++) {
                if(valores[j] > valores[j+1]) {
                    int temp = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = temp;
                }
            } 
        }
        System.out.print("\nValores em ordem crescente: [");
        for(int i=0; i<valores.length; i++) {
            if(i==valores.length-1) {
                System.out.print(valores[i]);
            } else {
                System.out.print(valores[i] + ", ");
            }
        }
        System.out.println("]");

        if(ordemCrescente) {
            System.out.println("\nA sequência digitada pelo usuário estava em ordem crescente.\n");
        } else {
            System.out.println("\nA sequência digitada pelo usuário não estava em ordem cresecente.\n");
        }
        sc.close();
    }
}
