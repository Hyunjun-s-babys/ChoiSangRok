import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.printf("%d ", arr[i]);
        }
    }
}
