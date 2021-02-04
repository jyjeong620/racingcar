package jyjeong.racingcar;

import java.util.Scanner;

public class InputView {

    Scanner input = new Scanner(System.in); // 이런 필드는 private final을 붙여주는 것이 좋아요! final의 장점을 검색해보아요.

    /**
     * 자동차 대수 입력받기
     */
    public int carCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return this.input.nextInt();
    }

    /**
     * 시도 횟수 입력받기
     */
    public int tryCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return this.input.nextInt();
    }

}
