import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1부터 100 사이의 숫자를 입력하시오:");
            int a = sc.nextInt();

            if (a >= 1 && a <= 100) {
                System.out.println("입력 완료! 프로그램을 종료합니다.");
                break;
            }
        }
    }
}