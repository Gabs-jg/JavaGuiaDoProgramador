package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;
        String input;

        System.out.println("Informe números para fazer a soma: (Digite 'Fim' para encerrar o programa.)");

        while (true) {
            System.out.print("--> ");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                soma += Double.parseDouble(input);
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida.");
            }
            System.out.println("Soma dos números informados: " + soma);
        }
        sc.close();
    }
    
}
