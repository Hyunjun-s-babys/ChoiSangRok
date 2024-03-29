import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i <= b; i++){
            sum = i % 2 == 0 ? sum - i : sum + i;

            if(i == a){
                System.out.printf("%d", a % 2 == 0 ? -a : a);
            }
            else if(i % 2 == 0){
                System.out.printf("-%d", i);
            }
            else{
                System.out.printf("+%d", i);
            }
        }
        System.out.printf("=%d", sum);
    }
}
