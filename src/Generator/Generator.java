package Generator;

import java.util.Random;

public interface Generator<T>{
    public T nextElemet();
    public boolean hasNext();
}
