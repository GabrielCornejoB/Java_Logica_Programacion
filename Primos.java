import java.util.Scanner;

public class Primos {   
    public static void main(String[] args) {

        //Declaración del teclado para insertar valores desde la consola 
        Scanner teclado = new Scanner(System.in);

        //Declaración e inicialización de variables
        int n = 0;                                      //Variable para iteraciones del ciclo de afuera
        int s = 0;                                      //Valor inicial del rango en el que se buscara 
        int m = 0;                                      //Valor final del rango en el que se buscara
        int i = 0;                                      //Variable para iteraciones del ciclo de adentro
        int contador_Divisores = 0;                     //Variable para contar el número de divisores que tiene

        //Interacción con el usuario 
        System.out.println("Ingrese el valor inicial desde el que quiere buscar los numeros primos: ");
        s = teclado.nextInt();
        System.out.println("Ingrese el valor final hasta el que quiere buscar los numeros primos");
        m = teclado.nextInt();
        System.out.println("Estos son los numeros primos en el rango seleccionado");

        for(n=s;n<=m;n++)                               //En este ciclo recorremos los números del 453 al 3500
        {         
            contador_Divisores = 0;                     //Empezamos el contador de divisores en 0 cada vez que pasa el ciclo

            for(i=1;i<=n;i++)                           //En este ciclo recorremos los números desde el 1 hasta n, para cada n
            {          
                if(n%i == 0)                            //Si el modulo entre n e i es igual a 0, aumentamos el contador de divisores para ese n
                {
                    contador_Divisores++;
                }                        
            }
            
            if(contador_Divisores<=2)                   //Si el contador de divisores es menor o igual a 2 (creo que no hace falta el menor, con un igual bastaría)
            {
                System.out.println(n);                  //Imprimimos el número, ya que este es primo por solo tener dos divisores
            }            
        }        
    }
}