import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int c = 0;
        int bc = 0;

        int arr[] = new int[7];

        for(int i = 0; i < 7; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++){
            int a = sc.nextInt();
            for(int j = 0; j < 6; j++){
                c = arr[j] == a ? c + 1 : c;
            }
            bc = arr[6] == a ? bc + 1 : bc;
        }

        System.out.println(c == 6 ? "1" : c == 5 && bc == 1 ? "2" : c == 5 ? "3" : c == 4 ? "4" : c == 3 ? "5" : "0");
    }
}
