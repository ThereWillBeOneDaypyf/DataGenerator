package Generator.PermutationGenerator;

import Generator.Generator;

import java.util.HashMap;
import java.util.Random;

public class PermutationGenerator implements Generator<Integer>{
    int cnt = 0;
    int maxLen = 0;
    Random random;
    HashMap<Integer,Boolean> hasGet;
    public PermutationGenerator(int maxLen){
        cnt = 0;
        this.maxLen = maxLen;
        random = new Random();
        hasGet = new HashMap<>();
    }

    @Override
    public Integer nextElemet() {
        cnt ++;
        int cur = random.nextInt(maxLen) + 1;
        while(hasGet.containsKey(cur)){
            cur = random.nextInt(maxLen) + 1;
        }
        hasGet.put(cur,true);
        return cur;
    }

    @Override
    public boolean hasNext() {
        return cnt < maxLen;
    }
}
