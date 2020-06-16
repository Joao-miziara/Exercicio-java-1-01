/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.pkg01.java;

import java.util.Scanner;



public class EX101Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite um numero");
        int n = entrada.nextInt();
        System.out.println (n%2 == 0? "par":"impar");
    }
    
}
