import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42]; // 0~41 까지의 수만 쓰면 되기에 new int[42]의 배열 생성.
        int cnt = 0;

        for ( int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine()); // 입력 받은 값 저장
            int mod = A % 42; // 나머지(mod)안에 입력 받은 값을 42로 나눈 나머지만 저장.
            arr[mod]++; // 배열안에 요소가 아닌 인덱스로 넣어서 중복을 제거. arr[i] = A % 42의 경우 중복이 제거가 안됨.
        }
        for (int j = 0; j < 42; j++) {
            if (arr[j] > 0) { // 배열의 인덱스 요소 (서로 다른 나머지)의 갯수에 따라 cnt를 증가시킴.
                cnt++; // ex. 42 84 42 1 2의 경우 arr[0] = 2, arr[1] = 1, arr[2] = 1, arr[3] = 1. true가 4번 이므로 4.
            }
        }
        System.out.println(cnt);
    }
}