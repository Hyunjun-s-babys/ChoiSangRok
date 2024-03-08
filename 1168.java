import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b == 1 || b == 2){
            a = a / 10000 + 1900;
            System.out.println(2012 - a + 1);
        }
        else{
            a = a / 10000 + 2000;
            System.out.println(2012 - a + 1);
        }        
    }
}
