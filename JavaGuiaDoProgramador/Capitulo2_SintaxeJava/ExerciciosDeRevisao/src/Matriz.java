package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Fazer a leitura de uma matriz 3x3 e calcular a determinante.
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matriz[][] = new double[3][3];
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        double a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
        double d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
        double g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];

        double determinante = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
        System.out.println("O determinante da matriz é: " + determinante);
        sc.close();
    }
}
        
