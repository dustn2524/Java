import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;

        while(true) {
            System.out.println("점수를 입력하세요 (종료하려면 음수를 입력) :");
            n = scanner.nextInt();

            if(n >= 0) {
                sum = sum + n;
            }
            else if (n < 0) {
                System.out.println("입력된 정수가 없습니다.");
                break;
            }
        }

        System.out.println("점수의 총합은: " + sum);


    }
}