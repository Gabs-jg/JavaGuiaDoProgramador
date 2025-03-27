package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Programa para fazer contagem de 0 até o número informado, incluindo ele
public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        for(int i=0; i<=numero; i++) {
            System.out.println(i);
        }
        sc.close();
    }
    
}
