package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Programa para ler 3 números reais e imprimir o maior deles.
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = sc.nextDouble();

        if(n1>n2) {
            if(n1>n3) {
                System.out.println("O número " + n1 + " é o maior número entre os números informados.");
            } else {
                System.out.println("O número " + n3 + " é o maior número entre os números informados.");
            }
        } else if(n2>n3) {
            System.out.println("O número " + n2 + " é o maior número entre os números informados.");
        } else {
            System.out.println("O número " + n3 + " é o maior número entre os números informados.");
        }
        sc.close();
    }
}
