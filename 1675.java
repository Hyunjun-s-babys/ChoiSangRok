import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char b[] = a.toCharArray();

        for(int i = 0; i < b.length; i++){
            if(b[i] == ' '){
                System.out.printf(" ");
            }
            else if(b[i] - 3 < 97){
                System.out.printf("%c" , b[i] + 23);
            }
            else{
                System.out.printf("%c", b[i] - 3);
            }
        }
	}
}
