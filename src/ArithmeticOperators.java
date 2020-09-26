public class ArithmeticOperators {

    public static void main(String[] args){

        // Java Operators

        // ----------------------------------------------------------------------------------------
        // Arithmetic Operators
        // ----------------------------------------------------------------------------------------
        System.out.println("Sum results");
        // SUM Operator (+)
        int sumOfTwoNumbers = 10 + 5;  // Here we are using the sum operator with two int literals
        int sumOfVariableAndLiteral = sumOfTwoNumbers + 20;  // Here we are the sum operator with a variable and a literal

        // Here the resulting value of this variable will be 50
        int sumOfTwoVariables =  sumOfTwoNumbers + sumOfVariableAndLiteral;  // Here we are using the sum operator with two variables
        System.out.println(sumOfTwoVariables);

        // ----------------------------------------------------------------------------------------
        // SUBTRACT Operator (-)
        // ----------------------------------------------------------------------------------------

        System.out.println("Subtraction results");

        // ((5-10)-20) - 5
        int subtractionOfTwoNumbers = 5 - 10;
        System.out.println(subtractionOfTwoNumbers);
        int subtractionOfVariableAndLiteral = subtractionOfTwoNumbers - 20;
        System.out.println(subtractionOfVariableAndLiteral);
        int subtractionOfTwoVariables = subtractionOfVariableAndLiteral - (-subtractionOfTwoNumbers);
        System.out.println(subtractionOfTwoVariables);

        // ----------------------------------------------------------------------------------------
        // MULTIPLICATION Operator (*)
        // ----------------------------------------------------------------------------------------
        System.out.println("Multiplication results");
        int multiplicationOfTwoNumbers = 5 * 6;
        System.out.println(multiplicationOfTwoNumbers);
        int multiplicationOfAVariableAndNumber = multiplicationOfTwoNumbers * 100;
        System.out.println(multiplicationOfAVariableAndNumber);
        int multiplicationOfTwoVariables = multiplicationOfTwoNumbers * multiplicationOfAVariableAndNumber;
        System.out.println(multiplicationOfTwoVariables);

        // ----------------------------------------------------------------------------------------
        // DIVISION Operator (/, %)
        // ----------------------------------------------------------------------------------------

        System.out.println("Division results");
        // Operator /

        double resultOfFullDivision = 32.0 / 5;
        System.out.println(resultOfFullDivision);

        int resultOfModulusDivision = 32 % 5;
        System.out.println(resultOfModulusDivision);

        // ----------------------------------------------------------------------------------------
        // INCREMENT AND DECREMENT
        // ----------------------------------------------------------------------------------------

        System.out.println("Increment and decrement");

        int count = 10;
        System.out.println("Value of count: " + count);

        int previousValue = count++;   // count = count + 1 | Post Increment
        System.out.println("Value of count: " + count);
        System.out.println("Value of previousValue: " + previousValue);

        int preIncrementReturnValue = ++count; // Pre-increment
        System.out.println("Value of count: " + count);
        System.out.println("Value of preIncrementReturnValue: " + preIncrementReturnValue);

        count = 10;
        int postDecrement = count--;  // Post Decrement
        System.out.println("Value of count: " + count);
        System.out.println("Value of postDecrement: " + postDecrement);

        count = 10;
        int preDecrement = --count;
        System.out.println("Value of count: " + count);
        System.out.println("Value of preDecrement: " + preDecrement);

    }
}


