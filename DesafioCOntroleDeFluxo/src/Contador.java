import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new  Scanner(System.in);

        System.out.println("Digite o numero i: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o numero 2: ");
        int numero2 = entrada.nextInt();


        try {
            if(numero1 > numero2){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            else{
                contar(numero1, numero2);
                
            }
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } 
        
    }

    public static void contar(int num1, int num2){

        @SuppressWarnings("unused")
        int subtraçãoDOsNumeros = Math.abs(num1 - num2);
       
        for(int i = 0; i < subtraçãoDOsNumeros; i++) {
            System.out.println("Numeros " + i);
        }   
    }
}
