/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author devilwall
 */
public class Problema {
    
    
    public static void Dados()
    { 
                   
            Random rnd = new Random();
            int result1 = (int)(rnd.nextDouble()*6+1);
            int result2 = (int)(rnd.nextDouble()*6+1);
            int result3 = (int)(rnd.nextDouble()*6+1);
            
            if(result1==result2 && result3==6 && result2==result3)
            {
                System.out.println("los dados son:"+result1+" "+result2+" "+result3+" ");
                System.out.println("Seis en los 3 dados, Excelente");
            }
            else if ((result1==result2 && result1==6) || (result2==result3 && result2==6) || (result1==result3 && result3==6)) 
            {
                System.out.println("los dados son:"+result1+" "+result2+" "+result3+" ");
                System.out.println("Seis en dos dados, Muy Bien");
            }
            else if (result1==6 || result2==6 || result3==6) 
            {
                System.out.println("los dados son:"+result1+" "+result2+" "+result3+" ");
                System.out.println("Seis en un dados, Regular");
            }
            else
            {
                System.out.println("los dados son:"+result1+" "+result2+" "+result3+" ");
                System.out.println("Ningun seis, Pesimo");
            }
    } 
    
    public static void Mayores()
    {
        
        
        int num;
        Scanner leer = new Scanner(System.in);
        String numero = "Los numeros validos son: ";
        int numerosT = 0;
        for (int i=1; i<=5; i++) 
        {
        System.out.println("Introdusca un, debe ser mayor que 20 :)");
        num = leer.nextInt();    
        if(num%2!=0)
        {
           i--;     
        }
        if (num>=20)
        {
            numero = numero + num +" ";
            numerosT = numerosT + num;
        }
        }
        System.out.println(numero);
        System.out.println("El total es: " + numerosT);
    }    
    
     public static void RandMulti()
    {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
            int mult1 = (int)(rnd.nextDouble()*12+1);
            int mult2 = (int)(rnd.nextDouble()*12+1);
            int multT = mult1*mult2;
    for (int k=1; k<=5; k++)
        {   
        System.out.println(k +" intento.");
            System.out.println("Escribe la multiplicacion de: "+mult1 + " x "+ mult2);
          int num = leer.nextInt();  
            if(num == multT)
            {
                System.out.println("Felicidades el Resultado de "+ mult1 + " x "+ mult2 +" Si es: "+multT);
                k=6;
            }
        }
         
    }
     public static void Triangulos()
         {
               Scanner leer = new Scanner(System.in);
                System.out.println("De cuantos * quieres los triangulos?");
        int triangulo = leer.nextInt();   
        for (int reng=1; reng<=triangulo ; reng++)
        {   
            System.out.println("");
            for (int  i=1 ;i<=reng ;i++)
            {
                System.out.print("*");
            }
            for (int j = 1;j<=(triangulo-reng+1); j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1;j<=(triangulo-reng+1); j++) 
            {
                System.out.print("*");
            }
        }
         
            
         }


        public static void Adivina()
         {
               Scanner leer = new Scanner(System.in);
               Random rnd = new Random();
               int num = (int)(rnd.nextDouble()*999+1);
               int respuesta=0;
         do{
               System.out.println("Adivina el numero entre 1 y 999");
               respuesta = leer.nextInt();  
               if (num>respuesta)
               {
                System.out.println("El numero es Mas Grande");
               }
               else if (num<respuesta)
               {
                      System.out.println("El numero es Mas Chico");
               }
                
         }while (respuesta!=num);
                    System.out.println("Adivinaste, el numero es: "+num);
         }
        
      public static void Credito()
      {
          double deuda = 6000;
          int l=0;
          do{
              deuda = deuda*1.15;
              l++;
          }while (deuda<55000);
          System.out.println("La deuda es de: "+deuda+" a los "+l+" meses.");
            
      }
        
}