import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        long i = 0, factorial = 0, numero = 3;

        System.out.println("Ingrese el numero al que le quiere encontrar el factorial");
        numero = teclado.nextLong();
        System.out.println("El valor del factorial de " + numero + " es:");

        factorial = numero;

        for(i=1; i<numero; i++)
        {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }   
}