package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;

//Programa para exibir nome informado na tela.
public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome informado: " + nome);
        sc.close();
    }
    
}
