import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a >= b && a >= c ? a < b + c ? "yes" : "no" : b >= a && b >= c ? b < a + c ? "yes" : "no" : c < a + b ? "yes" : "no");
    }
}
