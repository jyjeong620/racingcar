package jyjeong.racingcar;

import java.util.List;

public class ResultView {

    /**
     * 전체 차량 이동 횟수 출력
     */
    public void printCar(List<CarInfo> carInfos) {
        for(CarInfo carInfo : carInfos){
            printMove(carInfo);
            System.out.println();
        }
    }

    /**
     * 지정된 차의 이동횟수 출력
     */
    private void printMove(CarInfo carInfo) {
        for(int i = 0 ; i < carInfo.getCarMoveCount() ; i++) {
            System.out.print("-");
        }
    }
}
