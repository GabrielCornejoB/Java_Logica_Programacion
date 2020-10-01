public class Ejercicios_cadenas {    
    public static void main(String[] args) {
        
        String s = "Hola mundo";
        System.out.println("\nLa string original es: " + s);

        String_reves();
        Pares_mayusculas();
        Reemplazo_vocales();
        Detector_palindromas();
        Formato();
    }

    //Imprima una cadena de atras para adelante
    public static void String_reves()                                   
    {
        String s = "Hola mundo";
        System.out.println("\nLa string de atras para adelante es: ");
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            System.out.print(s.charAt(i));
        }
    }

    //Convertir los caracteres en posiciones pares en Mayusculas
    public static void Pares_mayusculas()
    {
        String s = "Hola mundo";    
        System.out.println("\n\nLa string con las posiciones pares en mayuscula");
        for (int i = 0; i < s.length(); i++) 
        {
            if(i%2 != 0)
            {
                System.out.print(s.toUpperCase().charAt(i));
            }
            else
            {
                System.out.print(s.toLowerCase().charAt(i));
            }
        }
    }

    //Reemplace las vocales de un string por *
    public static void Reemplazo_vocales()
    {     
        String s = "Hola mundo"; 
        System.out.println("\n\nLa string con las vocales reemplazadas por + es: ");
        for (int i = 0; i < s.length(); i++) 
        {
            String letra = s.charAt(i) +"";
            if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
            {
                System.out.print('*');
            }
            else
            {
                System.out.print(s.toLowerCase().charAt(i));
            }
        }
    }

    //Hacer un programa que detecte si una palabra es palindroma
    public static void Detector_palindromas()
    {  
        System.out.println("\n\nDetector de palabras palindromas");
        String palabra = "dinosaurio";
        /*Palabras palindromas para probar:
            ana     radar   arenera     oso
          Palabras no palindromas
            koala   computador          palabra
        */
        String palabra_escaneada_1 = "", palabra_escaneada_2 = "";
        for (int i = 0; i < palabra.length(); i++) 
        {
            palabra_escaneada_1 = palabra_escaneada_1 + palabra.charAt(i)+"";         
        }

        for (int i = palabra.length()-1; i >=0; i--) 
        {
            palabra_escaneada_2 = palabra_escaneada_2 + palabra.charAt(i);
        }

        System.out.print("La palabra escaneada al derecho es:    ");
        for (int i = 0; i < palabra_escaneada_1.length(); i++) {
            System.out.print(palabra_escaneada_1.charAt(i));
        }

        System.out.print("\nLa palabra escaneada al reves es:      ");
        for (int i = 0; i < palabra_escaneada_2.length(); i++) {
            System.out.print(palabra_escaneada_2.charAt(i));
        }

        if(palabra_escaneada_1.equals(palabra_escaneada_2))
        {
            System.out.println("\nLa palabra '" + palabra + "' es palindroma");
        }
        else
        {
            System.out.println("\nLa palabra '" + palabra + "' no es palindroma");
        }
    }
    
    //Hacer un programa que uno le pase el texto, y te pase el programa con mayucula inicial
    public static void Formato()
    {
        System.out.println("\nAsignador mayucula inicial");
        String oracion = "esta es una frase a la que le pondre mayuscula inicial";
        System.out.println("La frase original es: " + oracion);

        for (int i = 0; i < oracion.length(); i++) 
        {
            if(i==0)
            {
                System.out.print(oracion.toUpperCase().charAt(i));
            }   
            else
            {
                System.out.print(oracion.charAt(i));
            } 
        }
        System.out.println();
    }
}