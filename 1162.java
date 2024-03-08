import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((c - b + a) % 10 == 0){
            System.out.printf("대박");
        }
        else{
            System.out.printf("그럭저럭");
        }
    }
}
