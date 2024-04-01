import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int q;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            q = sc.nextInt();

            for(int j = 0; j < arr.length; j++){
                if(arr[j] == q){
                    System.out.print(1 + " ");
                    break;
                }
                if(j == arr.length - 1){
                    System.out.print(0 + " ");
                }
            }
        }
	}
}
