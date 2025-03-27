package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class ValoresCrescentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores serão lidos? ");
        int valores = sc.nextInt();
        int valorInformado;
        int numeros[] = new int [valores];
        for(int i=0; i<valores; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            valorInformado = sc.nextInt();
            numeros[i] = valorInformado;
        }
        System.out.println(numeros);
    }
}
