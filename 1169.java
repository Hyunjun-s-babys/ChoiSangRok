import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a > 13){
            a = 2012 - (a - 1) - 1900;
            System.out.println(a + " 1");
        }
        else{
            a = 2012 - (a - 1) - 2000;
            System.out.println(a + " 3");
        }        
    }
}
