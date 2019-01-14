/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
import java.util.Scanner;
public class Leer_altura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     double altura;
     int edad;
     int peso_recomendado = 0;
    System.out.println("Introduzca altura en m: " );
    altura=sc.nextInt();
    System.out.println("Introduzca edad: ");
    edad=sc.nextInt();
    
    peso_recomendado=(int) ((altura-100+10%edad)*0.9);
    
   
    }
    }
