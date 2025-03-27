package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite para exibir o fatorial dele: ");
        int numero = sc.nextInt();
        int fatorial = 1;
        while(numero != 1) {
            fatorial *= numero;
            numero--;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial + ".");
    }
}
