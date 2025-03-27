package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numInt = sc.nextInt();
        System.out.print("Informe um número real: ");
        double numReal = sc.nextDouble();
        System.out.println("Número inteiro:" + numInt + ". Número real: " + numReal + ".");
    }
    
}
