import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Declaración de variables, uso double para que los números se muestren correctamente, ya que son muy grandes
        double n = 0;                                       //Primeros 200 números
        double a = 0, b = 1, c = 0;                         //Variables para la formula de fibonacci

        //Interacción con el usuario
        System.out.println("Ingrese el numero hasta el que quiere ver la secuencia de fibonacci");
        n = teclado.nextDouble();

        do                                                  //Hago esto (ciclo do while)
        {
            System.out.println(a);                          //Imprimo a
            c = a + b;                      
            a = b;
            b = c;
        }while(--n>0);                                      //Hasta que pase esto
    }
}