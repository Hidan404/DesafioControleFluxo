import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe Contador que permite contar e imprimir uma sequência de números.
 */
public class Contador {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args argumentos passados via linha de comando atraves do Scanner
     * @throws Exception se ocorrer uma exceção não tratada a ser aplicada
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite o numero 1: ");
        int numero1 = entrada.nextInt();

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o numero 2: ");
        int numero2 = entrada.nextInt();

        try {
            // Verifica se o primeiro número é maior que o segundo
            if (numero1 > numero2) {
                // Lança uma exceção se o primeiro número for maior que o segundo
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            } else {
                // Chama o método contar se os números estiverem na ordem correta
                contar(numero1, numero2);
            }
        } catch (ParametrosInvalidosException e) {
            // Captura e imprime a mensagem da exceção ParametrosInvalidosException
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método que conta e imprime uma sequência de números.
     *
     * @param num1 o primeiro número
     * @param num2 o segundo número
     */
    public static void contar(int num1, int num2) {
        // Calcula a diferença entre os números
        int subtracaoDosNumeros = Math.abs(num1 - num2);

        // Imprime a sequência de números
        for (int i = 0; i < subtracaoDosNumeros; i++) {
            System.out.println("Numeros " + i);
        }
    }
}
