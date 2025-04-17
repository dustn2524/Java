import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basePrice = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkChoice = scanner.nextInt();

        if (drinkChoice == 1) {
            basePrice = 3000;
        } else if (drinkChoice == 2) {
            basePrice = 4000;
        } else if (drinkChoice == 3) {
            basePrice = 4500;
        } else {
            System.out.println("지원하지 않는 음료입니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int sizeChoice = scanner.nextInt();
        int sizePrice = 0;

        if (sizeChoice == 1) {
            sizePrice = 0;
        } else if (sizeChoice == 2) {
            sizePrice = 500;
        } else if (sizeChoice == 3) {
            sizePrice = 1000;
        } else {
            System.out.println("잘못된 크기 선택입니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int optionChoice = scanner.nextInt();
        int optionPrice = 0;

        if (optionChoice == 1) {
            optionPrice = 0;
        } else if (optionChoice == 2) {
            optionPrice = 500;
        } else if (optionChoice == 3) {
            optionPrice = 300;
        } else if (optionChoice == 4) {
            optionPrice = 800;
        } else {
            System.out.println("잘못된 옵션 선택입니다. 프로그램을 종료합니다.");
            return;
        }

        int totalPrice = basePrice + sizePrice + optionPrice;
        System.out.println("최종 가격은 " + totalPrice + "원입니다.");
    }
}