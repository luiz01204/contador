import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = terminal.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = terminal.nextInt();

        try {
            int contagem = Contador.contar(n1,n2);

            for(int i = 1; i <= contagem; i++){
                System.out.println(i);
            }
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }

    }
}