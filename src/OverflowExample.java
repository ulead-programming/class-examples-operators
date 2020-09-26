import java.util.Scanner;

public class OverflowExample {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite el primer numero: ");

        short firstNumber = scan.nextShort();

        System.out.print("Digite el segundo numero: ");

        short secondNumber = scan.nextShort();

        short result = (short)(firstNumber * secondNumber);

        System.out.println(result);


    }

}
