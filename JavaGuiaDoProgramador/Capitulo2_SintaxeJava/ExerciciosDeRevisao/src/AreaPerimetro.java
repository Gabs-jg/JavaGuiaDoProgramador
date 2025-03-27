package JavaGuiaDoProgramador.Capitulo2_SintaxeJava.ExerciciosDeRevisao.src;
import java.util.Scanner;
//Programa para calcular área de perímetro de um retângulo com valores informados.
public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Área: " + calcularArea(largura, comprimento) + ". Perímetro: " + calcularPerimetro(largura, comprimento));
        sc.close();
    }

    public static double calcularArea(double comprimento, double largura) {
        double area = comprimento * largura;
        return area;
    }

    public static double calcularPerimetro(double comprimento, double largura) {
        double perimetro = 2 * (comprimento + largura);
        return perimetro;
    }
}
