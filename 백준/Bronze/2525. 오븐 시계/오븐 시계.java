import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 요리 시간
        sc.close();

        int hour; // 시간=60분으로 계산하기 위해 만든 변수
        hour = A * 60 + B; // 시간을 분으로 바꾸고 기존의 분도 합침
        hour = hour + C; // 현재 시각 + 요리하는데 걸리는 시간

        int AA = (hour/60) % 24; // %24를 통해 24시 이상 넘어가는 걸 방지
        int BB = hour%60; // 시간과 분을 분리

        if (AA < 24 && BB < 60) { // 시 0 <= AA <= 23 / 분 0 <= BB <= 59 일때 출력
            System.out.print(AA + " " + BB);
        }
    }
}