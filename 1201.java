import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        System.out.println(a >= 0 ? a != 0 ? "양수" : 0 : "음수");
    }
}
