The application is a Java program that solves a quadratic equation (a second-degree equation). It prompts the user to enter three coefficients for the equation (a, b, and c) and calculates the real roots of the equation, displaying them.

The code is divided into two classes:

QuadraticEquationSolver (Equation Solver):

The main method is implemented in this class.
The Scanner is used to read the user's input for the coefficients a, b, and c.
An object of the EquationSolver class is created.
The solveQuadraticEquation method is called to solve the quadratic equation using the input coefficients.
EquationSolver (Equation Solver):

It contains the solveQuadraticEquation, isValidCoefficients, and findRoots methods.
The solveQuadraticEquation method checks if the coefficients are valid and then calculates the roots using the findRoots method or displays an error message if the coefficients are invalid.
The isValidCoefficients method checks if the coefficient a is not equal to zero (to ensure it's a valid quadratic equation).
The findRoots method uses the BiFunction to calculate the roots of the quadratic equation based on the input coefficients and returns an array containing the roots.
