import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("***** Calculator Menu *****");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponent");
        System.out.print("Select an option: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        System.out.print("\nEnter first operand: ");
        int operator1 = scanner.nextInt();
        System.out.print("Enter second operand: ");
        int operator2 = scanner.nextInt();

        switch (option) {
	    //put your case below this comment
            case 1:
              Addition.add(operator1,operator2);
              break;
            case 2:
              Subtraction.Subtract(operator1, operator2);
              break;
            case 3: 
                Multiplication.multiplication(operator1,operator2); 
                break; 
            case 4:
              Division.calculate(operator1, operator2);
              break;
            case 5:
                Exponent.exponent(operator1, operator2);
                break;
        }
    }
}
