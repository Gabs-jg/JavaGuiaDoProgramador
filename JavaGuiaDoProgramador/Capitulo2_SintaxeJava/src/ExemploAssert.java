import java.util.Scanner;

public class ExemploAssert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria um leitor de dados
        System.out.print("Forneça inteiro > 9: ");
        int valor = sc.nextInt(); //Lê valor inteiro
        assert valor > 9; //Esperado valor maior que 9
        int soma = 0; //Declara variável para soma
        for(int i = 1; i<valor;i++) { //Realiza laço para efetuar soma
            soma+= i;
            assert soma < 99: "Soma(" + soma + ")>=99"; //Esperado soma < 99
        }
        System.out.println("Soma[1.." + valor + "] = " + soma);
        sc.close();
    }
}
