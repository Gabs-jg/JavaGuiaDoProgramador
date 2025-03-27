package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
public class TempoMontante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor de depósito mensal: R$");
        double deposito = sc.nextDouble();
        System.out.print("Informe o valor do montante final: R$");
        double montante = sc.nextDouble();
        System.out.println("A quantidade de meses para alcançar um montante de R$" + montante + " com depósitos mensais de R$" + deposito + " é de " + calculoMeses(deposito, montante) + " meses.");
        sc.close();
    }

    public static int calculoMeses (double deposito, double montante) {
        int meses = 0;
        double saldo = 0;
        final double JUROS = 0.005;
        while(saldo < montante) {
            saldo += deposito;
            saldo += saldo*JUROS;
            meses++;
        }
        return meses;
    }
}
