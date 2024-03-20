import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int h = sc.nextInt();

        int max = k >= h ? k : h;
        int count = 1;
        int seq;
        int sum = 0;

        for(int i = 1; i <= max; i++){
            if(i % 2 == 0){
                seq = count * 10;
                count++;
            }
            else{
                seq = count;
            }
            
            if(i == k || i == h){
                sum += seq;
            }
        }

        System.out.println(sum);
    }
}
