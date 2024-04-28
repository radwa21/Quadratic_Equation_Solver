/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuadraticEquationSolver;
import java.util.*;
import java.util.function.Function;
import java.util.function.BiFunction;
/**
 *
 * @author Radwa
 */
/* Use the interfaces in java,util.function to  build an application that   
defines the roots of the quadratic equation (ax^2 + bx + c = 0) 
 
*/
public class QuadraticEquationSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();
        
          EquationSolver equationSolver = new EquationSolver();
        equationSolver.solveEquation(a, b, c);
    }
    
}
