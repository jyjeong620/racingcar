package jyjeong.racingcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingRunnerTest {

    RacingRunner racingRunner = new RacingRunner();

    ///< 단순히 프린트만 하지 말고, assertj를 사용하여 값을 검증해주세요!
    ///< random 값의 경우 어떤식으로 테스트를 하면 좋을지도 생각해봅시다.
    @Test
    void createRandom(){
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i + "번째 랜덤값 : " + racingRunner.createRandom());
        }
    }
}