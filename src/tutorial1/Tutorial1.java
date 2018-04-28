/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Scanner;

/**
 *
 * @author Mariie
 */
public class Tutorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     //   String s = null;
       
Scanner scanner = new Scanner(System.in);

    double totalplanilla=0;
    double totalhoras=0;

    String [] nombres = new String[5];
    double [] salario = new double[5];
    double [] horas = new double[5];

   for(int i=0; i<5; i++){
              System.out.print("-------------------------------\n");
              System.out.print("Ingrese los datos del empleado "+(i+1)+"\n");
              System.out.print("-------------------------------\n");
              System.out.print("Nombre: ");
              nombres[i] = scanner.nextLine();
              System.out.print("\n");             
               System.out.print("Salario por hora: ");
              salario[i] = Double.parseDouble(scanner.nextLine());
             System.out.print("\n"); 
               System.out.print("Horas Trabajadas: ");
              horas[i] = Double.parseDouble(scanner.nextLine());
               System.out.print("\n");   
         }

              System.out.print("-------------------------------\n");
              System.out.print("Nombre\tSalario\tHoras\tPago\n");
              System.out.print("-------------------------------\n");

  for(int i=0; i<5; i++){
             
              System.out.print(nombres[i]);              
              System.out.print("\t$");
              System.out.print(salario[i]);              
              System.out.print("\t");
              System.out.print(horas[i]);              
              System.out.print("\t$");  
              System.out.print(horas[i]*salario[i]);              
              System.out.print("\t"); 
              System.out.print("\n"); 
              totalhoras += horas[i];
              totalplanilla += horas[i]*salario[i];
              
         }

      System.out.print("-------------------------------\n");
      System.out.print("Total de horas trabajadas: "+totalhoras);
      System.out.print("\nTotal de planilla: $"+totalplanilla);
      System.out.print("\n-------------------------------\n\n"); 
        
    }
    
}
