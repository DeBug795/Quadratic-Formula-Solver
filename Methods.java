public class Methods {
    public void quadForm(int a, int b, int c){

        double discriminant = Math.sqrt(b*b - (4 * a * c));
        int negB = Math.negateExact(b);

        double numerator = negB - discriminant;
        double numerator2 = negB + discriminant;

        int denominator = 2 * a;

        double answer = numerator / denominator;
        double answer2 = numerator2 / denominator;

        System.out.print(answer);
        System.out.print(" and ");
        System.out.print(answer2);
        System.out.println(" ");
    }
}
