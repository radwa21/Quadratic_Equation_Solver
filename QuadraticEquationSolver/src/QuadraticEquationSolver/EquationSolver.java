/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuadraticEquationSolver;

import java.util.*;
import java.util.function.Function;
import java.util.function.BiFunction;

/**
 *
 * @author Radwa
 */
public class EquationSolver {
    public void solveEquation(double a, double b, double c){  
        if(isValidOperation(a)){ 
            findRoots(a, b, c);
        } else {
            System.out.println("Invalid coefficients entered. Please enter valid numeric values.");
        }
    }
        

    private boolean isValidOperation (double a ){  
      return a != 0; // Ensure a is non-zero for a valid quadratic equation
    }
    
    private void findRoots(double a, double b, double c) {
        BiFunction<Double, Double, double[]> rootsCalculator = (coefA, coefB) -> {
            double discriminant = coefB * coefB - 4 * coefA * c;
            if (discriminant > 0) {
                double root1 = (-coefB + Math.sqrt(discriminant)) / (2 * coefA);
                double root2 = (-coefB - Math.sqrt(discriminant)) / (2 * coefA);
                return new double[]{root1, root2};
            } else if (discriminant == 0) {
                double root = -coefB / (2 * coefA);
                return new double[]{root};
            } else {
                return new double[]{};
            }
        };

        double[] roots = rootsCalculator.apply(a, b);

        if (roots.length == 0) {
            System.out.println("The quadratic equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The quadratic equation has one real root: " + roots[0]);
        } else {
            System.out.println("The quadratic equation has two real roots: " + roots[0] + " and " + roots[1]);
        }
    }
}
