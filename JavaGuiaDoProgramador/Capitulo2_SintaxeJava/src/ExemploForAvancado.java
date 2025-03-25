public class ExemploForAvancado {
    public static void main(String[] args) {
        double arranjo[] = {1.1964, 6.1995, 7.1931, 12.1968};
        System.out.print("For comum:     [ ");
        int tamanho = arranjo.length;
        for(int i = 0; i < tamanho; i++) {
            System.out.print(arranjo[i] + " ");
        }
        System.out.println("] Fim");

        System.out.print("For avançado:  [ ");
        for(double elemento : arranjo) {
            System.out.print(elemento + " ");
        }
        System.out.println("] Fim");
    }
}