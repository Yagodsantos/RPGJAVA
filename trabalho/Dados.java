/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

/**
 *
 * @author YAGODOSSANTOSESOUZA
 */
import java.util.Scanner;
public class Dados  {
    


  

 
    public int rolar(Scanner scanner, int quantidade, int faces){
       int resultadoTotal = 0;
       for(int i = 1; i <= quantidade; i++){
           System.out.println("Pressione Enter para rolar o dado" + i + "de" + quantidade + "(d" + faces + ").");
           scanner.nextLine();
           int resultado = (int)(Math.random() *faces) + 1;
           System.out.println("Você rolou:" + resultado);
           resultadoTotal += resultado;
       }
       return resultadoTotal;
    }
    
}


