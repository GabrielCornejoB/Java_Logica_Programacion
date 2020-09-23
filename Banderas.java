public class Banderas {
    public static void main(String[] args) {
        
        System.out.println("\nBandera de Qatar: \n");
        Bandera_Qatar();
        System.out.println("\n\nBandera de Bosnia: \n");
        Bandera_bosnia();  
        System.out.println("\n\nBandera de Sudafrica: \n");
        Bandera_Sudafrica();
        System.out.println();
    }
    public static void Bandera_Qatar()
    {
        char qatar[][] = new char[9][32];               //Declaro e inicializo el arreglo
        //Ciclos para asignar los valores a la matriz
        for (int i = 0; i < qatar.length; i++) 
        {
            for (int j = 0; j < qatar[0].length; j++) 
            {
                if(j<=8)
                {
                    qatar[i][j] = '|';
                }
                else if(j==9)
                {
                    if(i%2 == 0)
                    {
                        qatar[i][j] = '<';
                    }
                    else
                    {
                        qatar[i][j] = '>';
                    }
                }
                else
                {
                    qatar[i][j] = '|';
                }
            }    
        }
        //Ciclos para imprimir la bandera
        for (int i = 0; i < qatar.length; i++) 
        {
            for (int j = 0; j < qatar[0].length; j++) 
            {
                if(j<=8)
                {
                    System.out.print(ConsoleColors.WHITE + qatar[i][j] + ConsoleColors.RESET);
                }
                else if(j==9)
                {
                    if(i%2 == 0)
                    {
                        System.out.print(ConsoleColors.RED + qatar[i][j] + ConsoleColors.RESET);
                    }
                    else
                    {
                        System.out.print(ConsoleColors.WHITE + qatar[i][j] + ConsoleColors.RESET);
                    }       
                }
                else
                {
                    System.out.print(ConsoleColors.RED + qatar[i][j] + ConsoleColors.RESET);
                }
            }
            System.out.println();
        }
    }
    public static void Bandera_bosnia()
    {
        char bosnia[][] = new char[9][32];
        int contador_diag = 8, contador_otra_diag_xd = 7;

        for (int i = 0; i < bosnia.length; i++) 
        {
            for (int j = 0; j < bosnia[0].length; j++) 
            {
                if(j<=6)
                {
                    bosnia[i][j] = '\\';
                }
                else if(j>=contador_diag)
                {
                    bosnia[i][j] = '\\';
                    
                }
                else if(j>= contador_otra_diag_xd)
                {
                    bosnia[i][j] = '*';
                }
                else
                {
                    bosnia[i][j] = '\\';
                }
            }
            contador_diag = contador_diag + 2;
            contador_otra_diag_xd = contador_otra_diag_xd + 2;   
        }
        contador_diag = 8;
        contador_otra_diag_xd = 7;
        for (int i = 0; i < bosnia.length; i++) 
        {
            for (int j = 0; j < bosnia[0].length; j++) 
            {
                if(j<=6 || j==contador_otra_diag_xd + 1 || j>=26)
                {
                    System.out.print(ConsoleColors.BLUE + bosnia[i][j] + ConsoleColors.RESET);
                }
                else if(j>=contador_diag)
                {
                    System.out.print(ConsoleColors.YELLOW + bosnia[i][j] + ConsoleColors.RESET);
                }
                else if(j>=contador_otra_diag_xd)
                {
                    System.out.print(ConsoleColors.WHITE + bosnia[i][j] + ConsoleColors.RESET);
                }
                else
                {
                    System.out.print(ConsoleColors.BLUE + bosnia[i][j] + ConsoleColors.RESET);
                }
            }
            contador_diag = contador_diag + 2;
            contador_otra_diag_xd = contador_otra_diag_xd + 2;
            System.out.println();
        }       
    }
    public static void Bandera_Sudafrica()
    {
        char sudafrica[][] = new char[10][32];

        for (int i = 0; i < sudafrica.length; i++) 
        {
            for (int j = 0; j < sudafrica[0].length; j++) 
            {
                if(i<=4)
                {
                    sudafrica[i][j] = '\\';
                }
                else if(i>=5)
                {
                    sudafrica[i][j] = '/';
                }         
            }
        }
        int contador = 10, contador2 = 11;                                  //Contadores para linea blanca diag de arriba
        int contador_inv = 15, contador_inv2 = 14;                          //Contador para linea blanca diag de abajo
        int contador_tr_arriba = 1, contador_tr_arriba2 = 2;
        int contador_tr_abajo = 6, contador_tr_abajo_2 = 5;
        for (int i = 0; i < sudafrica.length; i++) 
        {
            for (int j = 0; j < sudafrica[0].length; j++) 
            {
                if((i==4 || i==5))
                {
                    if(j<8)
                    {
                        System.out.print(ConsoleColors.BLACK + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j==8 || j==9)
                    {
                        System.out.print(ConsoleColors.YELLOW + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else
                    {
                        System.out.print(ConsoleColors.GREEN + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                }     
                else if(i==3 || i==6)
                {
                    if(j>=15)
                    {
                        System.out.print(ConsoleColors.WHITE + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j==7 || j==8)
                    {
                        System.out.print(ConsoleColors.YELLOW + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j<7)
                    {
                        System.out.print(ConsoleColors.BLACK + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else
                    {
                        System.out.print(ConsoleColors.GREEN + sudafrica[i][j] + ConsoleColors.RESET);
                    }            
                }
                else if (i<=2)
                {
                    if(j == contador || j==contador2)
                    {
                        System.out.print(ConsoleColors.WHITE + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j>=contador2)
                    {
                        System.out.print(ConsoleColors.RED + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j==contador_tr_arriba || j==contador_tr_arriba2)
                    {
                        System.out.print(ConsoleColors.YELLOW + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j<contador_tr_arriba)
                    {
                        System.out.print(ConsoleColors.BLACK + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else
                    {
                        System.out.print(ConsoleColors.GREEN + sudafrica[i][j] + ConsoleColors.RESET);
                    }           
                }
                else if(i>=7)
                {
                    if(j == contador_inv || j == contador_inv2)
                    {
                        System.out.print(ConsoleColors.WHITE + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j>=contador_inv)
                    {
                        System.out.print(ConsoleColors.BLUE + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j==contador_tr_abajo || j==contador_tr_abajo_2)
                    {
                        System.out.print(ConsoleColors.YELLOW + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else if(j < contador_tr_abajo)
                    {
                        System.out.print(ConsoleColors.BLACK + sudafrica[i][j] + ConsoleColors.RESET);
                    }
                    else 
                    {
                        System.out.print(ConsoleColors.GREEN + sudafrica[i][j] + ConsoleColors.RESET);
                    }             
                }   
                else
                {
                    System.out.print(ConsoleColors.GREEN + sudafrica[i][j] + ConsoleColors.RESET);              
                }             
            } 
            //Para linea blanca arriba
            contador = contador +2;
            contador2 = contador2 +2;
            
            contador_tr_arriba = contador_tr_arriba+2;
            contador_tr_arriba2 = contador_tr_arriba2+2;
            
            //Para linea blanca abajo
            if(i>=7)
            {
                contador_inv = contador_inv -2;
                contador_inv2 = contador_inv2 -2;
                contador_tr_abajo = contador_tr_abajo -2;
                contador_tr_abajo_2 = contador_tr_abajo_2 -2;
            }
            System.out.println();
        }
    }
}
