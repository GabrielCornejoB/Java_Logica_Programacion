package Matrices;

public class Ejercicio_suma_columnas_matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int var_llenar_matriz = 1;

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                matriz[i][j] = var_llenar_matriz;
                var_llenar_matriz++;
            }
        }

        System.out.println("\nLa matriz original es:");
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print(matriz[i][j] + "   ");
            }    
            System.out.println();
        }


        int suma_c1 = 0, suma_c2 = 0, suma_c3 = 0;
        int columna_1[] = new int[matriz.length];
        int columna_2[] = new int[matriz.length];
        int columna_3[] = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                if(j==0)
                {
                    suma_c1 = suma_c1 + matriz[i][j];
                    columna_1[i] = matriz[i][j];
                }
                if(j==1)
                {
                    suma_c2 = suma_c2 + matriz[i][j];
                    columna_2[i] = matriz[i][j];
                }
                if(j==2)
                {
                    suma_c3 = suma_c3 + matriz[i][j];
                    columna_3[i] = matriz[i][j];
                }
            }
        }

        System.out.println("\nLa columna 1 es: ");
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.println(columna_1[i]);
        }
        System.out.println("\nLa suma es: " + suma_c1);
        System.out.println("\nLa columna 2 es: ");
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.println(columna_2[i]);
        }
        System.out.println("\nLa suma es: " + suma_c2);
        System.out.println("\nLa columna 3 es: ");
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.println(columna_3[i]);
        }
        System.out.println("\nLa suma es: " + suma_c3);
    }
}
