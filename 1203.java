import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));

        int a = Integer.parseInt(br.readLine());

        bw.write(a <= 20 ? a <= 10 ? "정상" : "과체중" : "비만");

        bw.flush();
        bw.close();
        br.close();
    }
}
