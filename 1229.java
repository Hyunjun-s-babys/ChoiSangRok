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
        Double a = height >= 160 ? (height - 100) * 0.9 : height >= 150 ? (height - 150) / 2 + 50 : height - 100;

        bw.write((weight - a) * 100 / a <= 20 ? (weight - a) * 100 / a <= 10 ? "정상" : "과체중" : "비만");

        bw.flush();
        bw.close();
        br.close();
    }
}
