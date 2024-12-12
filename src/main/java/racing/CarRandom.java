package racing;

import java.util.Random;

public class CarRandom {
    private Random random = new Random();

    public int getRand() {
        int rand = random.nextInt(6)+1;
        if (rand > 6 || rand < 1) {
            throw new IllegalArgumentException("주사위는 1부터 6까지입니다.");
        }
        return rand;
    }
}
