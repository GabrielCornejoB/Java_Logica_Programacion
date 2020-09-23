package Matrices;

public class Ejercicio_diagonal_matrices {
    public static void main(String[] args) {

        float matriz[][] = new float[3][3];
        matriz[0][0] = 3.5f;
        matriz[0][1] = 2.7f;
        matriz[0][2] = 6f;
        matriz[1][0] = 12.1f;
        matriz[1][1] = 15.7f;
        matriz[1][2] = 0.5f;
        matriz[2][0] = 21.4f;
        matriz[2][1] = 9f;
        matriz[2][2] = 2.1f;

        float diagonal[] = new float[matriz.length];
        float suma_diagonal = 0f; 

        System.out.println("\nLa matriz original es la siguiente:");
        for(int x = 0; x<matriz.length; x++)
        {
            for(int y = 0; y<matriz.length; y++)
            {
                System.out.print(matriz[x][y] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nLa diagonal principal de la matriz es: ");
        for(int i=0; i<matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                if(i==j)
                {
                    diagonal[i] = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < diagonal.length; i++) 
        {
            System.out.print(diagonal[i] + "   ");
            suma_diagonal = suma_diagonal + diagonal[i];
        }
        
        System.out.println("\n\nLa suma de la diagonal es: " + suma_diagonal);
    }
}
