import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double rev = a;

        for(int i = 1; i <= b; i++){
            double percent = sc.nextDouble() / 100;

            rev = rev * (1 + percent);
        }
    
        System.out.printf("%.0f\n", rev - a);
        System.out.println(rev - a >= 0 ? rev - a != 0 ? "good" : "same" : "bad");
    }
}
