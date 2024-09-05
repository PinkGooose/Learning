package lesson15.Homework.Supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class GetLotoBarrelSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return ThreadLocalRandom.current().nextInt(1, 90 + 1);
    }
}
