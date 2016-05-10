/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author devilwall
 */
public class EjercicioClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int Ej;
        
        
        System.out.println("Seleccione Problema: ");
        System.out.println("1.- evaluar 3 dados: ");
        System.out.println("2.- leer 5 numeros mayores que 20 y sumarlos: ");
        System.out.println("3.- juego de multiplicar aleatorio: ");
        System.out.println("4.- triangulos: ");
        System.out.println("5.- adivina el numero");
        System.out.println("6.- Intereses del banco");
             
        Ej = leer.nextInt();
        Problema e1 = new Problema();
        switch (Ej){
            case 1:
                e1.Dados();
            break;
            case 2: 
                e1.Mayores();
            break;
            case 3: 
                e1.RandMulti();
            break;
            case 4: 
                e1.Triangulos();
            break;
            case 5: 
                e1.Adivina();
            break;
            case 6: 
                e1.Credito();
            break;
        }    
       
    }
    
}
