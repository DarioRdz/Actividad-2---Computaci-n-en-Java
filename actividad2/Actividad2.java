/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tecmilenio.actividad2;

import java.util.Scanner;

  class Estudiante{
  
      
      
      public String nombre; 
      int[] calificaciones=new int[5]; // se declaran los cinco espacios de las calificaciones 
      
      public Estudiante(String nombre){
          
          this.nombre= nombre; 
          
          
      }
  }

/**
 *
 * @author DARIO
 */
public class Actividad2 {
   

    public static void main(String[] args)  {
        
       int[] calificaciones=new int[5];  
       int suma= 0, promedio= 0; 
       char nota; 
       
       Scanner alumno= new Scanner(System.in);  
      
       System.out.println("Ingrese el nombre: "); //imprimimos el nombre del alumno. 
       String nombre = alumno.next();
        
       Estudiante nombre_alumno= new Estudiante(nombre.toString());
        
       System.out.println(nombre_alumno);
        
       for(int i=0; i<=calificaciones.length -1; i++) {
       
          System.out.println("Ingrese la calificación " +i); 
          Scanner calificacion= new Scanner(System.in); 
          int calificacion_alumno= calificacion.nextInt(); 
          calificaciones[i]= calificacion_alumno; 
          System.out.println(calificaciones[i]); 
          
          suma= suma+calificacion_alumno; 
          
          
        }
       
          promedio= suma/5; 
          
          System.out.println("El promedio es: "+promedio); // los calculos del promedio 
        
          
          if(promedio<51){
              System.out.println("Nota: F");         
          }
          else if(promedio<61){
              System.out.println("Nota: E");   
          } 
          else if(promedio<71){
              System.out.println("Nota: D");   
          }   
          else if(promedio<81){
              System.out.println("Nota: C");   
          }
          else if(promedio<91){
              System.out.println("Nota: B");   
          }    
          else if(promedio<101){
              System.out.println("Nota: A");   
          }
    
    }
}

