import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a <= b && a <= c){
            if(b <= c){
                System.out.printf("%d %d %d", a, b, c);
            }
            else{
                System.out.printf("%d %d %d", a, c, b);
            }
        }
        else if(b <= a && b <= c){
            if(a <= c){
                System.out.printf("%d %d %d", b, a, c);
            }
            else{
                System.out.printf("%d %d %d", b, c, a);
            }
        }
        else{
            if(a <= b){
                System.out.printf("%d %d %d", c, a, b);
            }
            else{
                System.out.printf("%d %d %d", c, b, a);
            }
        }        
    }
}
