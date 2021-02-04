package jyjeong.racingcar;

import java.util.Random;

public class RandomMoveRule implements MoveRule {

    private final static int RANDOM_RANGE = 10;

    private final int count;
    private final Random random = new Random();

    public RandomMoveRule() {
        this.count = this.createRandom();
    }

    @Override
    public int getCount() {
        return this.count;
    }

    /**
     * 0~9랜덤한 숫자 생성하는 메소드
     * @return 랜덤 숫자
     */
    public int createRandom(){
        return random.nextInt(RANDOM_RANGE);
    }
}
