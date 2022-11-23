/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Scanner;
import java.util.Locale;

public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite;
        int contador = 1;
        
        System.out.println("Ingrese el limite:");
        limite = entrada.nextInt();
          
        while (contador <= limite){
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;
        }
        
    }
}
