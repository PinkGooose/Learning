package lesson14;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class MarkSupplier implements Supplier {
    @Override
    public Object get() {
        return ThreadLocalRandom.current().nextInt(2, 5 + 1);
    }
}
