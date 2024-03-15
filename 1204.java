import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        System.out.printf(a % 10 == 1 ? a / 10 != 1 ? a + "st" : "11th" : a % 10 == 2 ? a / 10 != 1 ? a + "nd" : "12th" : a % 10 == 3 ? a / 10 != 1 ? a + "rd" : "13th" : a + "th");
    }
}
