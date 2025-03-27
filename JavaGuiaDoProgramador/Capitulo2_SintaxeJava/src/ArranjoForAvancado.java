import java.util.Scanner;

public class ArranjoForAvancado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de elementos? "); //Lê número de elementos.
        int tamanho = sc.nextInt();
        assert tamanho>0; //Usa assert.
        int arranjo[] = new int[tamanho]; //Aloca arranjo
        for(int i=0; i<tamanho; i++) {
            System.out.print("Elemento[" + i + "]? ");
            arranjo[i] = sc.nextInt();
        }
        sc.close();
        int soma = 0;
        System.out.print("[ ");
        for(int elemento:arranjo) {
            soma+= elemento; //Soma elementos
            System.out.print(elemento + " ");
        }
        System.out.println("] soma = " + soma); //Exibe soma obtida
    }
}