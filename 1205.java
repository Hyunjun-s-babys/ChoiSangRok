import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = a + b;
        double d = a - b;
        double e = b - a;
        double f = a * b;
        double g = a / b;
        double h = b / a;
        double i = Math.pow(a, b);
        double j = Math.pow(b, a);

        double array[] = {c, d, e, f, g, h, i, j};
        double max = array[0];

        for(int k = 1; k < array.length; k++){
            max = max < array[k] ? array[k] : max;
        }

        System.out.printf("%.6f", max);
    }
}
