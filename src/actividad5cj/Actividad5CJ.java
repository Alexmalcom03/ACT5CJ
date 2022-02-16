/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5cj;

import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class Actividad5CJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Operaciones operacion= new Operaciones ();
        
        System.out.println("Ingresa el primer numero");
        float x = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        float y = sc.nextInt();
        
        System.out.println("Suma:\t"+operacion.suma(x, y));
        System.out.println("Resta:\t"+operacion.resta(x, y));
        System.out.println("Multiplicacion:\t"+operacion.multiplicacion(x, y));
        System.out.println("Division:\t"+operacion.division(x, y));
        System.out.println("Modulo:\t"+operacion.modulo(x, y));
        
           
    }
    
}
