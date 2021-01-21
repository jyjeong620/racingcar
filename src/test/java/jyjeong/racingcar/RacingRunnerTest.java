package jyjeong.racingcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingRunnerTest {

    RacingRunner racingRunner = new RacingRunner();

    @Test
    void createRandom(){
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i + "번째 랜덤값 : " + racingRunner.createRandom());
        }
    }
}