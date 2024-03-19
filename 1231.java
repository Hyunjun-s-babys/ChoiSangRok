import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String cal = sc.next();
        String[] calarr = new String[2];

        if(cal.contains("+")){
            calarr = cal.split("\\+");
            int a = Integer.parseInt(calarr[0]);
            int b = Integer.parseInt(calarr[1]);
            System.out.println(a + b);
        }
        else if(cal.contains("-")){
            calarr = cal.split("\\-");
            int a = Integer.parseInt(calarr[0]);
            int b = Integer.parseInt(calarr[1]);
            System.out.println(a - b);
        }
        else if(cal.contains("*")){
            calarr = cal.split("\\*");
            int a = Integer.parseInt(calarr[0]);
            int b = Integer.parseInt(calarr[1]);
            System.out.println(a * b);
        }
        else{
            calarr = cal.split("\\/");
            int a = Integer.parseInt(calarr[0]);
            int b = Integer.parseInt(calarr[1]);
            System.out.printf("%.2f", (double)a / b);
        }
    }
}
