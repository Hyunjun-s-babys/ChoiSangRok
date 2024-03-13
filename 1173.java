import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int min = sc.nextInt();
        
        System.out.printf("%d %d", time != 0 ? min < 30 ? time - 1 : time : min < 30 ? 23 : 0, min < 30 ? min + 30 : min - 30);
    }
}
