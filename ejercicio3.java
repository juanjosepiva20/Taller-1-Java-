package ejercicio3;

import java.util.Scanner;



/**
 *
 * @author user
 */
public class ejercicio3 {


    public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
       System.out.println("Por favor ingrese su edad");
       int edad = teclado.nextInt();
       
       if (edad >= 18){
           System.out.println("Bienvenido al sistema");
       }
       else {
           System.out.println("No cumples el requisito de ser mayor de edad");
    }
        
  }
       
   
}