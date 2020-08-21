import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        
        int num_Figura = 0;
        Scanner teclado = new Scanner(System.in);

        do
        {     
            System.out.println("");
            System.out.println("Ingrese el numero de la figura que quiere ver (del 1 al 4): ");
            mostrarMenu();
            num_Figura = teclado.nextInt();
            System.out.println("");

            switch(num_Figura)
            {
                case 1:
                    figuraEscalera();
                    break;

                case 2:
                    figuraArbol();                    
                    break;

                case 3:
                    figuraPortal();
                    break;

                case 4:
                    figuraPiramide();
                    break;
                case 5:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Ese numero no está disponible");
                    break;
                
            }    
        }    
        while(num_Figura != 5);       
    }

    public static void mostrarMenu()
    {
        System.out.println("");
        System.out.println("ESTAS SON LAS FIGURAS");
        System.out.println("1. Figura escalera");
        System.out.println("2. Figura arbol");
        System.out.println("3. Figura portal");
        System.out.println("4. Figura piramide");
        System.out.println("");
        System.out.println("Presione 5 para salir");
        System.out.println("");
    }

    public static void figuraEscalera()
    {
        int i1 = 0;
        String arbolito = "";

        System.out.println("La escalera para salir de latinoamerica");
        System.out.println("");

        for(i1=0; i1<=5; i1++)
        {
            arbolito = arbolito + "+";
            System.out.println(arbolito);
        }
    }

    public static void figuraArbol()
    {
        int i2 = 0;                 //Iteraciones verticales del for
        int n2 = 0;                 //Espacios
        int m2 = 0;                 //Asterizcos

        System.out.println("Arbolito de navidad");
        System.out.println("");

        for(i2=0; i2<=7; i2++)
        {
            if(i2==0 || i2==1 || i2==2 || i2==3 || i2==4 || i2==5)
            {
                for(n2=0; n2<5-i2; n2++)
                {
                    System.out.print(" ");
                }
                for(m2=0; m2<(2*i2 + 1); m2++)
                {
                    System.out.print("*");
                }          
            }
            else if(i2==6)
            {
                for(n2=0; n2<11; n2++)
                {
                    if(n2==0 || n2==1 || n2==2 || n2==8 || n2==9 || n2==10)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }             
                }
            }
            else
            {
                for(n2=0; n2<11; n2++)
                {
                    if(n2==0 || n2==1 || n2==2 || n2==8 || n2==9 || n2==10)
                    {
                        System.out.print("_");
                    }
                    else
                    {
                        System.out.print("*");
                    }             
                }
            }
            System.out.println();
        }
        
    }

    public static void figuraPortal()
    {   
        int i3 = 0;                 //Verticales
        int n = 0, m = 0;           //Horizontales

        System.out.println("Portal del nether");
        System.out.println("");
                
         for(i3=0; i3<=7; i3++)
         {
            if(i3 == 0 || i3 == 1 || i3 == 6 || i3 == 7)
            {
                for(n=0;n<=7;n++)
                {
                    System.out.print("*");
                }            
            }
            else
            {
                for(m=0; m<=7; m++)
                {
                    if(m==0 || m ==1 || m == 6 || m==7)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");                  
        }
    }

    public static void figuraPiramide()
    {
        System.out.println("Piramideeeeeeee");
        System.out.println("");

        int i4 = 0;
        int n4 = 0;
        String piramide = "";
        char[] posiciones = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
      
        for(i4=8,n4=8; n4>0; i4++, n4--)
        {
            char guion = '_';
            char barra = '|';

            if(i4==8)            
            {
                posiciones[i4] = guion;
                posiciones[n4] = guion;
                piramide = new String(posiciones);
            
                System.out.println(piramide);
        
            }
            else if(i4%2 != 0)
            {
                posiciones[i4] = barra;
                posiciones[i4+1] = guion;
                posiciones[n4] = barra;
                posiciones[n4-1] = guion;

                piramide = new String(posiciones);
            
                 System.out.println(piramide);
            }
            else
            {
                posiciones[i4] = ' ';
                posiciones[n4] = ' ';
                piramide = new String(posiciones);
            
            } 
            posiciones[i4] = ' ';
            posiciones[n4] = ' ';
        } 
    }
}