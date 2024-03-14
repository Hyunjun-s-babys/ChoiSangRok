import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));

        int a = Integer.parseInt(br.readLine());
        
        bw.write(a >= 0 ? a != 0 ? "양수" : "0" : "음수");

        bw.flush();
        bw.close();
        br.close();
    }
}
