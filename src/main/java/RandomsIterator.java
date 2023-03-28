import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {

    protected final Random RANDOM;
    protected final int MIN, MAX;

    public RandomsIterator(Random random, int min, int max) {
        this.RANDOM = random;
        this.MIN = min;
        this.MAX = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int diff = MAX - MIN;
        int i = RANDOM.nextInt(diff + 1);
        i += MIN;
        return i;
    }
}
