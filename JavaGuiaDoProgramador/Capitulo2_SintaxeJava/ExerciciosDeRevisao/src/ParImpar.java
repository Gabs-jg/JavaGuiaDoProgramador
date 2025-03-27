package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Programa para exibir se o número informado é ímpar ou par
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para saber se é ímpar ou par: ");
        int numero = sc.nextInt();
        if(numero%2 == 0) {
            System.out.println("O número: " + numero + " é par.");
        } else {
            System.out.println("O número: " + numero + " é ímpar");
        }
        sc.close();
    }
    
}
