package jyjeong.racingcar;

public class CarInfo {

    private int carMoveCount;

    public CarInfo() {

    }

    public int getCarMoveCount() {
        return carMoveCount;
    }

    public void moveCar(){
        carMoveCount++;
    }
}
