import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int goal = sc.nextInt();
        
        int goalresult = ((90 - time) / 5) + goal + 1;

        if((90 - time) % 5 == 0){
            goalresult = goalresult - 1;
            System.out.println(goalresult);
        }
        else{
            System.out.println(goalresult);
        }
    }
}
