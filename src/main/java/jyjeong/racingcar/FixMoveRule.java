package jyjeong.racingcar;

public class FixMoveRule implements moveRule {

    private int count;

    public FixMoveRule(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
