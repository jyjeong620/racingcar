package jyjeong.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingRunner {
    private final static int MOVABLE_VALUE = 3;
    private final static int RANDOM_RANGE = 10;
    List<CarInfo> carInfos = new ArrayList<>();
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();

    public void run() {
        int carCount = this.inputView.carCount();
        int tryCount = this.inputView.tryCount();
        setCar(carCount);
        for(int i = 0 ; i < tryCount ; i++){
            racingCar();
            System.out.println();
        }

    }

    /**
     * 0~9랜덤한 숫자 생성하는 메소드
     * @return 랜덤 숫자
     */
    public int createRandom(){
        Random random = new Random();
        return random.nextInt(RANDOM_RANGE);
    }

    /**
     * 숫자가 0~3 이면 멈추고 4~9면 움직이게하는 메소드 isMovable
     */
    public void isMovable(CarInfo carInfo, int count){
        if(count > MOVABLE_VALUE) {
            carInfo.moveCar();
        }
    }

    /**
     * 입력받은 CarCount 만큼 CarInfo 생성
     */
    private void setCar(int carCount) {
        for(int i = 0 ; i < carCount ; i++) {
            CarInfo carInfo = new CarInfo();
            this.carInfos.add(carInfo);
        }
    }

    /**
     * 입력받은 MoveCount 만큼 CarMove 후 출력
     */
    private void racingCar(){
        for(CarInfo carInfo : this.carInfos){
            isMovable(carInfo, createRandom());
        }
        this.resultView.printCar(this.carInfos);
    }
}
