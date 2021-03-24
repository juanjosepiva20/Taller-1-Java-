package ejercicio2;

import static ejercicio2.ejercicio2.main;

/**
 *
 * @author user
 */
public class ejercicio2 {
    String datos_personales() {
        String nombre="Juan José";
        int edad=22;
        char genero = 'M';
        String tipo_doc = "C.C";
        int nro_doc = 1053866417;
        boolean hijos = false;
        boolean casado = false;
        
        if (hijos == true)
            System.out.println("Si tengo hijos");
        else
            System.out.println("No tengo hijos");
        
        if (casado == true)
            System.out.println("Si estoy casado");
        else
            System.out.println("No estoy casado");
        
        return genero + " " + nombre + " " + edad + " años " +" "+ tipo_doc + " " + nro_doc + " ";
        
                
    }  
    
    public static void main(String[] args) {
        
        ejercicio2 instClass = new ejercicio2();
        System.out.println(instClass.datos_personales());
    }
    
}