package Helper;

import java.util.Random;

public class Helper {
    private Random rdm = new Random();

    public int getRandom(int max){
        return 1 + rdm.nextInt(max - 1 + 1);
    }
}
