package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Programa que exibe o número informado por extenso.
public class NumeroPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para exibir ele escrito por extenso:[0 - 49] ");
        int numero = sc.nextInt();

        if(numero < 0 || numero > 49) {
            System.out.println("Número fora do intervalo.");
        } else {
            System.out.println("O número " + numero + " escrito por extenso é: " + numeroPorExtenso(numero));
        }
        sc.close();
    }

    private static final String[] UNIDADES = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
        "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    private static final String[] DEZENAS = {" ", " ", "vinte", "trinta", "quarenta"};

    public static String numeroPorExtenso(int numero) {
        if(numero < 20) {
            return UNIDADES[numero];
        } else if(numero < 50) {
            int dezena = numero / 10;
            int unidade = numero % 10;
            return unidade == 0 ? DEZENAS[dezena] : DEZENAS[dezena] + " e " + UNIDADES[unidade];
        } else {
            return "Número fora do intervalo.";
        }
    }
}

 