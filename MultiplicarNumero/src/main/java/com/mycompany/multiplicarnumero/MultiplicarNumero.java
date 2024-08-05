/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicarnumero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MultiplicarNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int numero1, numero2,r;
        System.out.println("Ingrese el primer valor");
        numero1=sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        numero2=sc.nextInt();
        System.out.print("la multiplicacion es:"+numero1*numero2);
        
    }
}
