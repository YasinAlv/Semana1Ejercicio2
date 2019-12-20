/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int NumA = 4, NumB = 8, Resultado;

        System.out.println("El primer numero es: " + NumA);
        System.out.println("El segundo numero es: " + NumB);

        if (NumA > NumB) {
            System.out.println("El primer numero es mayor");

        } else if (NumB > NumA) {
            System.out.println("El segundo numero es mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }

    }

}
