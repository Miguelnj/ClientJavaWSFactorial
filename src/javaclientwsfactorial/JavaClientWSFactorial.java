/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientwsfactorial;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaClientWSFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(hello("Miguel"));
        
        System.out.println("Write a number to calculate its factorial.");
        
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
       
        System.out.println(factorial(n));
        
    }
    private static int factorial(int n) {
        fact.Factorial_Service service = new fact.Factorial_Service();
        fact.Factorial port = service.getFactorialPort();
        return port.factorial(n);
    }

    private static String hello(java.lang.String name) {
        fact.Factorial_Service service = new fact.Factorial_Service();
        fact.Factorial port = service.getFactorialPort();
        return port.hello(name);
    }
    
}
