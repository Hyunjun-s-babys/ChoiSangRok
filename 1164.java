import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 170 && b > 170 && c > 170){
            System.out.printf("PASS");
        }
        else{
            System.out.printf("CRASH");
        }
    }
}
