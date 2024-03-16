import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(b != 2 ? b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12 ? "31" : "30" : a  % 400 == 0 || (a % 4 == 0 && a % 100 != 0) ? "29" : "28");
    }
}
