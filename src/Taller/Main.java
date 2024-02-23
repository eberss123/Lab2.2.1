
package Taller;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner lectura= new Scanner(System.in);
         Persona per1= new Persona();
         
         System.out.println("ingrese su nombre");
         String nombre= lectura.nextLine();
         per1.setNombre(nombre);
         
         System.out.println("Bienvenido " + per1.getNombre());
        System.out.println("----------------------------------");
        
        System.out.println("en que lugar dormiras?");
        String lugar= lectura.nextLine();
        per1.dormir(lugar);
        System.out.println("-------------------");
        
        System.out.println("En donde haras ejercicio?");
        String ejercicio= lectura.nextLine();
        per1.hacerEjercicio(ejercicio);
        System.out.println("-------------------------------------------");
         
        System.out.println("que comeras?");
        String comida= lectura.nextLine();
        Persona.comer(comida);
        
    }
   
    
    
    
}

