import java.util.Random;

public class Turn {
    Random ran = new Random();
    int random = ran.nextInt(2);

    public int getRandom(){
        return random;
    }
}
