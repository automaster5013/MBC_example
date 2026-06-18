package d4.p64;
/*
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] com = new int[3]; // 컴퓨터 난수 저장 배열

        // 1. 중복 없는 3개 난수 생성 (각 숫자는 1~9 사이로 가정)
        for (int i = 0; i < com.length; i++) {
            com[i] = random.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--; // 중복이 발견되면 인덱스를 뒤로 돌려 다시 뽑기
                    break;
                }
            }
        }

        System.out.println("★ 숫자 야구 게임을 시작합니다 (1~9 사이의 서로 다른 숫자 3개) ★");

        // 2. 무한 루프 돌며 게임 진행
        while (true) {
            int[] user = new int[3];
            System.out.print("3개의 숫자를 입력하세요 (예: 1 2 3): ");
            for (int i = 0; i < user.length; i++) {
                user[i] = sc.nextInt();
            }

            int strike = 0;
            int ball = 0;

            // 3. 스트라이크 / 볼 판정 논리 연산
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        if (i == j) {
                            strike++; // 위치와 숫자가 모두 같음
                        } else {
                            ball++;   // 숫자는 같지만 위치가 다름
                        }
                    }
                }
            }

            // 4. 결과 출력 및 게임 종료 조건 검사
            if (strike == 3) {
                System.out.println("3 Strikes! 정답을 모두 맞췄기 때문에 게임을 종료합니다.");
                break;
            } else if (strike == 0 && ball == 0) {
                System.out.println("Out!");
            } else {
                System.out.printf("%d Strike, %d Ball\n", strike, ball);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] com = new int[3];
        boolean[] isUsed = new boolean[10]; // 각 숫자가 사용되었는지 기록하는 깃발 상자

        int count = 0;
        while (count < 3) {
            int num = rd.nextInt(9) + 1;
            if (!isUsed[num]) { // 아직 사용되지 않은 숫자라면
                com[count] = num;
                isUsed[num] = true; // 사용 중으로 플래그 전환
                count++;
            }
        }

        while (true) {
            System.out.print("숫자 3개를 공백으로 구분하여 입력: ");
            int u0 = sc.nextInt();
            int u1 = sc.nextInt();
            int u2 = sc.nextInt();

            int strike = 0, ball = 0;

            // 첫 번째 자리 판정
            if (u0 == com[0]) strike++;
            else if (u0 == com[1] || u0 == com[2]) ball++;

            // 두 번째 자리 판정
            if (u1 == com[1]) strike++;
            else if (u1 == com[0] || u1 == com[2]) ball++;

            // 세 번째 자리 판정
            if (u2 == com[2]) strike++;
            else if (u2 == com[0] || u2 == com[1]) ball++;

            if (strike == 3) {
                System.out.println("3 Strikes! 게임 종료!");
                break;
            }
            System.out.println("결과: " + strike + " Strike, " + ball + " Ball");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String comStr = "";
        while (comStr.length() < 3) {
            String num = String.valueOf(rd.nextInt(9) + 1);
            if (!comStr.contains(num)) { // 문자열 안에 해당 숫자가 포함되어 있지 않다면 누적
                comStr += num;
            }
        }

        while (true) {
            System.out.print("붙여서 3자리 숫자 입력 (예: 492): ");
            String userStr = sc.next();

            int strike = 0, ball = 0;

            for (int i = 0; i < 3; i++) {
                char userChar = userStr.charAt(i);
                int indexInCom = comStr.indexOf(userChar);

                if (indexInCom != -1) { // 숫자가 존재하긴 함
                    if (indexInCom == i) {
                        strike++; // 위치까지 똑같음
                    } else {
                        ball++;   // 위치는 다름
                    }
                }
            }

            if (strike == 3) {
                System.out.println("3 Strikes 완료! 탈출합니다.");
                break;
            }
            System.out.printf("판정 -> S: %d | B: %d\n", strike, ball);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 카드를 100번 마구잡이로 섞기 (Shuffle)
        for (int i = 0; i < 100; i++) {
            int rIdx = rd.nextInt(9);
            int temp = deck[0];
            deck[0] = deck[rIdx];
            deck[rIdx] = temp;
        }

        // 완전히 섞인 카드 덱의 맨 앞 3장을 컴퓨터 정답으로 지정 (중복 없음이 100% 보장됨)
        int[] com = {deck[0], deck[1], deck[2]};

        while (true) {
            System.out.print("정수 3개 입력: ");
            int[] user = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

            int strike = 0, ball = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        int dummy = (i == j) ? strike++ : ball++; // 삼항 연산 결합형 증감
                    }
                }
            }

            System.out.println("-> " + strike + "S " + ball + "B");
            if (strike == 3) {
                System.out.println("게임 종료!");
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] com = new int[3];
        // 1번 방법의 중복 배제 로직 활용
        for (int i = 0; i < 3; i++) {
            com[i] = rd.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) { i--; break; }
            }
        }

        System.out.println("재귀 야구 게임 기동!");
        playInning(sc, com);
    }

    public static void playInning(java.util.Scanner sc, int[] com) {
        System.out.print("3자리 숫자 차례대로 입력: ");
        int[] user = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int strike = 0, ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (com[i] == user[j]) {
                    if (i == j) strike++; else ball++;
                }
            }
        }

        // 기저 탈출 조건: 3 스트라이크 달성 시 함수 연쇄 종료
        if (strike == 3) {
            System.out.println("3 Strikes! 축하합니다. 재귀 종료.");
            return;
        }

        System.out.printf("[판정 결과] S: %d, B: %d\n", strike, ball);

        // 정답을 맞추지 못했다면 다음 이닝을 위해 다시 자기 자신을 호출 (반복 효과)
        playInning(sc, com);
    }
}
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 100; i++) {
            int rIdx = rd.nextInt(9);
            int temp = deck[0];
            deck[0] = deck[rIdx];
            deck[rIdx] = temp;
        }

        int[] com = {deck[0], deck[1], deck[2]};

        while (true) {
            System.out.print("정수 3개 입력: ");
            int[] user = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

            int strike = 0, ball = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        int dummy = (i == j) ? strike++ : ball++;
                    }
                }
            }

            System.out.println("-> " + strike + ":S " + ball + ":B");
            if (strike == 3) {
                System.out.println("게임 종료!");
                break;
            }
        }
    }
}














