package racing;

import java.util.Random;

public class CarRandom {
    private  static Random random = new Random();

    public static int getRand() {
        return random.nextInt(6)+1;


    }

    public record lottonnum(int number) {
        public lottonnum {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("");
            }
        }
    }
}
