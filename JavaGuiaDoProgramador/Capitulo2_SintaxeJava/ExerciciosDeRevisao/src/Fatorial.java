package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Calcular o fatorial de um número informado.
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite para exibir o fatorial dele: ");
        int numero = sc.nextInt();
        if(numero < 0) {
            System.out.println("Número inválido.");
        }
        if(numero == 0 || numero == 1) {
            System.out.println("O fatorial de " + numero + " é 1.");
        }
        int fatorial = 1;
        while(numero != 1) {
            fatorial *= numero;
            numero--;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial + ".");
        sc.close();
    }
}
