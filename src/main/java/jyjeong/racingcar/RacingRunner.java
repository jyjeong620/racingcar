package jyjeong.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingRunner {
    private final static int MOVABLE_VALUE = 3;
    private final static int RANDOM_RANGE = 10;
    private final List<CarInfo> carInfos = new ArrayList<>();
    private final InputView inputView = new InputView();
    private final ResultView resultView = new ResultView();
    private final Random random = new Random();

    public void run() {
        int carCount = this.inputView.carCount();
        int tryCount = this.inputView.tryCount();
        this.addCar(carCount);
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
        return random.nextInt(RANDOM_RANGE);
    }

    /**
     * 숫자가 0~3 이면 멈추고 4~9면 움직이게하는 메소드 isMovable
     */
    public void canMovable(CarInfo carInfo, int count){
        if(count > MOVABLE_VALUE) {
            carInfo.moveCar();
        }
    }

    /**
     * 입력받은 CarCount 만큼 CarInfo 생성
     */
    private void addCar(int carCount) {
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
            canMovable(carInfo, createRandom());
        }
        this.resultView.printCar(this.carInfos);
    }
}
