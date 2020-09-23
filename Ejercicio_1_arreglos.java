

public class Ejercicio_1_arreglos {
    public static void main(String[] args) {

        int arreglo[];                                      //Declaro el arreglo
        arreglo = new int[10];                              //Le doy el tamaño al arreglo 
        int suma = 0;                                       //Variable para almacenar la suma de los números del arreglo
        float promedio = 0f;                                //Variable donde se almacenara el valor del promedio de los números 

        //Ciclo para asignar los valores aleatorios al arreglo
        for(int i = 0; i<arreglo.length; i++)
        {
            arreglo[i] = (int) (Math.random() * 10);        //Con esta linea se asignan solo números del 0 al 9
        }

        //Ciclo para imprimir el arreglo original 
        System.out.println(" \nEl arreglo original es el siguiente: ");
        for(int i = 0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i] + " ");             //Se imprime 1 valor del arreglo por cada iteración del ciclo    
        }

        System.out.println(" \n \nLos valores en las posiciones pares del arreglo son: \n(si empezamos contando desde el 1)");
        for(int i = 0; i<arreglo.length; i++)
        {       
            //Si el indice del arreglo en el que va el ciclo, tiene como residuo 0 cuando se divide entre 2 (es par)
            if(i%2 != 0)
            {
                System.out.print(arreglo[i] + " ");         //Se imprime el valor de esa posición del arreglo
            }
        }

        //Ciclo para imprimir solo los números pares del arreglo
        System.out.println(" \n \nLos pares son:");
        for(int i = 0; i<arreglo.length; i++)
        {
            suma = suma + arreglo[i];                       //Se van sumando los valores de cada termino del arreglo
            
            //Si el indice del arreglo en el que va el ciclo, tiene como residuo 0 cuando se divide entre 2 (es par)
            if(arreglo[i]%2 == 0)
            {
                System.out.print(arreglo[i] + " ");         //Se imprime el valor de esa posición del arreglo
            }
        }

        //Operaciones para realizar el promedio 
        promedio =  ((float) suma / (float) arreglo.length);    //Se le asgiana a la variable promedio el valor de la división de la suma (en float) y la longitud del arreglo (en float)
        System.out.println("El promedio de los numeros es: " + promedio);

        //Ciclo para imprimir el arreglo al reves
        System.out.println("\nEl arreglo al reves seria: ");
        for (int i = (arreglo.length - 1); i >= 0; i--)         //Se empieza en la ultima posición del arreglo (longitud - 1), 
        {                                                       //se termina cuando i sea mayor o igual a 0, y se va decrementando i
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(" ");
    }    
}
