import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }
    }
    public class ParametrosInvalidosException extends Exception {}
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois); System.out.println("O segundo parâmetro deve ser maior que o primeiro.");


        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++)
        System.out.println("Imprimindo o número " + i);
    }
}
