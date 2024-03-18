import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        while(a <= b){
            System.out.printf("%.2f ", a);
            a += 0.01;
        }
    }
}
