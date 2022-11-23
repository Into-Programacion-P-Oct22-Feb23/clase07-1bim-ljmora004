
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;


public class Ejemplo101 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla;
        int contador = 1;
        int operacion;
        int tabla;
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limite_tabla = entrada.nextInt();
        
        String cadena = ""; // cadena acumulador
        cadena = String.format("%sTabla de multiplicar\n", cadena);
        
        while (contador <= limite_tabla){
            operacion = tabla * contador;
            
            cadena = String.format("%s%d*%d=%d\n\n", 
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena);
        
    }
}
