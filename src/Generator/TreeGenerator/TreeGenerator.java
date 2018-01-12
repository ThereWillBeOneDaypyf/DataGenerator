package Generator.TreeGenerator;

import Generator.Generator;

import java.util.Random;

public class TreeGenerator implements Generator<Integer>{
    int cnt;
    int maxLen;
    Random random;
    public TreeGenerator(int maxLen){
        cnt =  1;
        this.maxLen = maxLen;
        random = new Random();
    }

    @Override
    public boolean hasNext() {
        return cnt < maxLen;
    }

    @Override
    public Integer nextElemet() {
        int cur = random.nextInt(cnt) + 1;
        cnt ++;
        return cur;
    }
}
