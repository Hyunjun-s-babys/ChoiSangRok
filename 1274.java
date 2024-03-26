import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 2; i <= a; i++){
            if(i == a){
                System.out.println("prime");
                break;
            }
            if(a % i == 0){
                System.out.println("not prime");
                break;
            }
        }
    }
}
