package jyjeong.racingcar;

import java.util.Scanner;

public class InputView {

    Scanner input = new Scanner(System.in);

    /**
     * 자동차 대수 입력받기
     */
    public int carCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return input.nextInt();
    }

    /**
     * 시도 횟수 입력받기
     */
    public int tryCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return input.nextInt();
    }

}
