/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas031 {
    public static void main(String[] args) {
        String nombre = "Luis";
        String apellido = "Mora";
        int edad = 18;
        String cadenaAcumuladora = "Datos Personales\n";
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, nombre);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, apellido);
        
        cadenaAcumuladora = String.format("%s%d\n", cadenaAcumuladora, 
                edad);
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
