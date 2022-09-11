import java.util.Scanner;
public class main {
    public static void main(String []args){
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.println("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.println("Enter value for c: ");
        int c = scanner.nextInt();

        System.out.print("The answer to the quadratic equation is: ");
        methods.quadForm(a,b,c);
    }
}
