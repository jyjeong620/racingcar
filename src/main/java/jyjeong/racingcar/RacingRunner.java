package jyjeong.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingRunner {
    private final static int MOVABLE_VALUE = 3;
    private final static int RANDOM_RANGE = 10;
    List<CarInfo> carInfos = new ArrayList<>();     ///< 특별한 목적이 없는 경우 대부분의 필드는 private으로 보호해주세요!
    InputView inputView = new InputView();          ///< 값이 변경되지 않는 경우 final을 붙여주세요!
    ResultView resultView = new ResultView();

    public void run() {
        int carCount = this.inputView.carCount();
        int tryCount = this.inputView.tryCount();
        setCar(carCount);                           ///< this. 코드 컨벡션!
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
        Random random = new Random();           ///< Random이 매번 createRandom()을 호출 할 때마다 초기화 될 필요는 없는 것 같아요.
        return random.nextInt(RANDOM_RANGE);
    }

    /**
     * 숫자가 0~3 이면 멈추고 4~9면 움직이게하는 메소드 isMovable
     */
    public void isMovable(CarInfo carInfo, int count){  ///< is라는 prefix는 다른 용도로도 사용되기 때문에 can과 같이 다른 접두어를 붙여주면 좋을 것 같아요
        if(count > MOVABLE_VALUE) {
            carInfo.moveCar();
        }
    }

    /**
     * 입력받은 CarCount 만큼 CarInfo 생성
     */
    private void setCar(int carCount) {             ///< set이라는 prefix는 지양해주세요!
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
