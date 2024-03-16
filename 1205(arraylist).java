import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        ArrayList<Double> arr = new ArrayList<>();

        arr.add(a + b);
        arr.add(a - b);
        arr.add(b - a);
        arr.add(a * b);
        arr.add(a / b);
        arr.add(b / a);
        arr.add(Math.pow(a, b));
        arr.add(Math.pow(b, a));

        double max = arr.get(0);

        for(int k = 1; k < arr.size(); k++){
            max = max < arr.get(k) ? arr.get(k) : max;
        }

        System.out.printf("%.6f", max);
    }
}
