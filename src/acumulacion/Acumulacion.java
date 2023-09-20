/*
Ejercicio 6: Pedir números hasta
que se teclee un O, mostrar la
suma de todos los números
introducidos.
*/
package acumulacion;

import javax.swing.JOptionPane;


public class Acumulacion {


    public static void main(String[] args) {
        int numero,acumulador=0;
        
     /*do {
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        
        acumulador = numero+numero;*/
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
     while (numero !=0){
     acumulador += numero; 
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
     }
           
       
        System.out.println("La suma de todos los numeros es: "+acumulador);
    }
    
}
