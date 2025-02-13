import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int avg = 0; // (주사위 값이 2개만 같을 때)
        if (A == B) {
            avg = A;
        } else if (A == C) {
            avg = A;
        } else if (B == C) {
            avg = B;
        }

        int max; // 가장 큰 수(주사위가 전부 다를 때)
        if (A > B & A > C) { // A가 가장 클때
            max = A;
        }
        else if (B > A & B > C ) { // B가 가장 클때
            max = B;
        }
        else max = C; // C가 가장 클때

        if ( A != B && A != C && B != C) { // 주사위 값이 전부 다를 때
            System.out.println(max * 100);
        } else if ((A == B) && (A != C)) { // 주사위 값이 2개만 같을 때
            System.out.println((avg * 100) + 1000);
        } else if ((A == C) && (A != B)) {// 주사위 값이 2개만 같을 때
            System.out.println((avg * 100) + 1000);
        } else if ((B == C) && (B != A)) {// 주사위 값이 2개만 같을 때
            System.out.println((avg * 100) + 1000);
        } else if ((A == B) && (B == C)) { // 주사위 값이 전부 같을 때
            System.out.println(10000 + (A * 1000));
        }
    }
}