/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21mmlp11;

import com.google.gson.Gson;

/**
 *
 * @author Usuario
 */
public class G4S21MMLp11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos datos = new Datos (" leonardo",19, "personal@gmail.com");
        Gson gson = new Gson();
        String cadena = gson.toJson(datos);
        System.out.println("nombre" + datos.getNombre());
        System.out.println("edad " + String.valueOf(datos.getEdad()));
        System.out.println("correo " + datos.getCorreo());
        
        System.out.println("La cadena contiene -> " + cadena);
        
        String cjson = "{\"nombre\":\" javier\",\"edad\":22,\"correo\":\"sincorreo@gmail.com\"}";
             
        Datos datos2 = gson.fromJson(cjson, Datos.class);
        
        System.out.println("nombre" + datos2.getNombre());
        System.out.println("edad " + String.valueOf(datos2.getEdad()));
        System.out.println("correo " + datos2.getCorreo());
        
                
    }
    
}
