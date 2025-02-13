import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; // 예외 처리
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{ // main에 예외 처리 반드시 선언하기. 안하면 readLine(), br,bw 사용 못함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수 T 생성

        StringTokenizer st; // // 문자열을 토큰 단위로 분리하기 위한 StringTokenizer 선언

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," "); // 문자열 분리를 위해 for문 안에 정수 받기
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");  // 분리된 문자열을 정수로 변환하여 덧셈 후 결과를 BufferedWriter에 저장
        }
        br.close(); // BufferedReader 닫기 (더 이상 입력받지 않음)

        bw.flush(); // BufferedWriter 버퍼에 저장된 내용을 출력
        bw.close(); // BufferedWriter 닫기 (더 이상 출력하지 않음)
    }
}