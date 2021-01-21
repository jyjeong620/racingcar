package jyjeong.racingcar;

public class RacingRunner {

    private int carCount;
    private int tryCount;
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();

    public void run() {
        carCount = inputView.carCount();
        tryCount = inputView.tryCount();

    }

    //TODO 0~9랜덤한 숫자 생성하는 메소드

    //TODO 숫자가 0~3 이면 멈추고 4~9면 움직이게하는 메소드 isMovable

    //TODO 입력받은 CarCount 만큼 CarInfo 생성

    //TODO 입력받은 MoveCount 만큼 CarMove 후 출력
}
