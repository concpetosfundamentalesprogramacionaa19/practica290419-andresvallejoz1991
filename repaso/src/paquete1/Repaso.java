/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
import paquete2.Porcentajes;
import static paquete2.Porcentajes.desc1;
import static paquete2.Porcentajes.desc2;
import static paquete2.Porcentajes.desc3;
import static paquete2.Porcentajes.desc4;
import static paquete2.Porcentajes.descf;
/**
 *
 * @author Andrés Vallejo
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int matricula = 1330;
        double costo_final;
        double desc_edad;
        double desc_ciudad;
        double desc_cargo;
        double desc_estado;
        
      System.out.println("Ingrese el estado civil");
        String estado = sc.nextLine();
        
            
        System.out.println("Ingrese La Procedencia del Estudiante");
        String ciudad = sc.nextLine();
        
        System.out.println("Posee cargas familiares");
        int cargas = sc.nextInt();    
        
        System.out.println("Ingrese la edad del estudiante");
        int edad = sc.nextInt();
        
        double descuento1= Porcentajes.desc1;
        double descuentof= Porcentajes.descf;
        double descuento2= Porcentajes.desc2;
        double descuento3= Porcentajes.desc3;
        double descuento4= Porcentajes.desc4;
        
        
        if (edad>=17 && edad<20){
               desc_edad = desc2;
        }else{
            desc_edad = 0;
        }  
        if (ciudad.equals("Loja") || ciudad.equals ("Zamora") ){
              desc_ciudad = desc1;
        }else {
            desc_ciudad = 0;
        }    
        if (estado.equals("Casado")){
             desc_estado = desc3;      
        }else {
            desc_estado = 0;
        }
        if (cargas>=1){
            desc_cargo = desc4;
        }else{
            desc_cargo = 0;     
        }
        costo_final = (matricula-desc_edad-desc_ciudad-desc_estado-desc_cargo+descf);
        System.out.printf("El costo final de la matricula es %f1" ,costo_final);
    }
    
}
