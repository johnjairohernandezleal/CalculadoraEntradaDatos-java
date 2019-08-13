/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraentradadatos;
import java.util.*;
import static calculadora.Operaciones.sumar;

/**
 *
 * @author john hernandez
 */
public class CalculadoraEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("proporciona el segundo Valor");
        int b = scan.nextInt();
        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es:" + resultado);
    }
    
}
