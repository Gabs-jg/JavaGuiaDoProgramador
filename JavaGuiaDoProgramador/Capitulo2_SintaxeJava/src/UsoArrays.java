import java.util.Scanner;
import java.util.Arrays;

public class UsoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Prepara o console
        System.out.print("Número de elementos: "); //Lê o número de elementos
        int tamanho = sc.nextInt();
        System.out.print("Preenchimento real? "); //Lê preenchimento
        double valor = sc.nextDouble();
        double arranjo1[] = new double[tamanho]; //Aloca arranjo
        Arrays.fill(arranjo1, valor); //Preenche arranjo
        System.out.print(Arrays.toString(arranjo1)); //Exibe arranjo

        //Lê posições inicial e final da cópia
        System.out.print("Posição inicial da cópia? ");
        int de = sc.nextInt();
        System.out.println("Posição final da cópia? ");
        int para = sc.nextInt();

        //Efetua cópia parcial e integral
        double arranjo2[] = Arrays.copyOfRange(arranjo1, de, para);
        double arranjo3[] = Arrays.copyOf(arranjo1, arranjo1.length);

        //Exibe novos arrays
        System.out.println("Cópia parcial: " + Arrays.toString(arranjo2));
        System.out.println("Cópia total: " + Arrays.toString(arranjo3));
        sc.close(); //Fecha o console
    }
    
}
