package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class SomaTermos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor inteiro: ");
        int numero = sc.nextInt();
        double soma = 0;
        for(int i=1; i <= numero; i++) {
            if(i%2 != 0) {
                soma += 1.0 / i;
            } else {
                soma -= 1.0 / i;
            }
        }
        System.out.println("A soma dos termos de 1 até 1/" + numero + " é: "  + soma + ".");
    }
}
