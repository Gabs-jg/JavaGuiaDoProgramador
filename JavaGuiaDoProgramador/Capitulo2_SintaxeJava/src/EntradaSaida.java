import java.util.Scanner;
public class EntradaSaida {
    public static void main(String[] args) {
        System.out.println("Olá!"); //Mensagem inicial
        System.out.println("Digite um inteiro: "); //Exibe a mensagem
        Scanner s = new Scanner(System.in); //Prepara entrada de dados
        int valor = s.nextInt(); //Declara e inicia a variável
        System.out.println("Valor = " + valor); //Exibe valor lido
        s.close(); //Fecha o objeto leitor
    }
}

