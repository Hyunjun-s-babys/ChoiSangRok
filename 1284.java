import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                for(int j = 2; j <= i; j++){
                    if(j == i){
                        arr.add(i);
                    }
                    else if(i % j == 0){
                        break;
                    }
                }
            }
        }

        if(arr.size() == 2 && n == arr.get(0) * arr.get(1)){
            System.out.println(arr.get(0) + " " + arr.get(1));
        }
        else{
            System.out.println("wrong number");
        }
    }
}
