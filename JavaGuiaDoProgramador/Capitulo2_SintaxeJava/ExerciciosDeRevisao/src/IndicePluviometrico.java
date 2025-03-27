package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Determinar Índice pluviométrico médio e máximo junto ao dia, com base em valores informados.
public class IndicePluviometrico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaDoMes = 1;
        int diaMax = 0;
        double indiceMax = 0;
        double soma = 0;
        final int QUANT_DIAS = 31;
        while(diaDoMes <= QUANT_DIAS) {
            System.out.print("Informe o índice pluviométrico do dia " + diaDoMes +": ");
            double indice = sc.nextDouble();
            if(indice > indiceMax) {
                indiceMax = indice;
                diaMax = diaDoMes;
            }
            soma += indice;
            diaDoMes++;
        }
        double media = soma/QUANT_DIAS;
        System.out.println("Índice pluviométrico médio do mês: " + media + ".");
        System.out.println("Índice pluviométrico máximo: " + indiceMax + " no dia: " + diaMax + ".");
        sc.close();
    }
    
}
