public class Promedio_Primos {
    public static void main(String[] args) {
        float n = 0;                                    //Variable para iteraciones del ciclo de afuera
        float s = 1;                                    //Valor inicial del rango en el que se buscara 
        float m = 100;
        float i = 0;                                    //Variable para iteraciones del ciclo de adentro
        int contador_Divisores = 0;                     //Variable para contar el número de divisores que tiene
        float promedio = 0;
        float numero_de_primos = 0;

        System.out.println("\n"); 
        System.out.println("Los numeros primos son: ");
        for(n=s;n<=m;n++)                               //En este ciclo recorremos los números del 453 al 3500
        {         
            contador_Divisores = 0;                     //Empezamos el contador de divisores en 0 cada vez que pasa el ciclo

            for(i=1;i<=n;i++)                           //En este ciclo recorremos los números desde el 1 hasta n, para cada n
            {          
                if(n%i == 0)                            //Si el modulo entre n e i es igual a 0, aumentamos el contador de divisores para ese n
                {
                    contador_Divisores++;
                }   
                if(n == 1)
                {
                    contador_Divisores = contador_Divisores + 3;
                }                               
            }
            
            if(contador_Divisores<=2)                   //Si el contador de divisores es menor o igual a 2 (creo que no hace falta el menor, con un igual bastaría)
            {
                System.out.print(n + "  ");             //Imprimimos el número, ya que este es primo por solo tener dos divisores
                numero_de_primos++;
                promedio = promedio + n;
            }            
        }   

        promedio = promedio / numero_de_primos;
        System.out.println("\n");  
        System.out.println("El promedio es: " + promedio);   
        
    }
}