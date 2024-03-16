import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Double height = Double.parseDouble(st.nextToken());
        Double weight = Double.parseDouble(st.nextToken());

        bw.write(((weight - ((height - 100) * 0.9)) * 100) / ((height - 100) * 0.9) <= 20 ? ((weight - ((height - 100) * 0.9)) * 100) / ((height - 100) * 0.9) <= 10 ? "정상" : "과체중" : "비만");

        bw.flush();
        bw.close();
        br.close();
    }
}
