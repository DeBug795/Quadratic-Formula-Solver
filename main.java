import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class main {
    public static void main(String []args){

        JFrame frame = new JFrame("Quadratic Equation Solver");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter in the \"a\" value: ");

        JTextPane textAreaA = new JTextPane();
        //Edit text area so it is actually usable
        textAreaA.setVisible(true);
        textAreaA.setSize(200,10);
        textAreaA.setLocation(50,50);

        JButton button = new JButton();
        button.setText("Calculate");

        panel.add(label);
        panel.add(button);
        panel.add(textAreaA);

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

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
