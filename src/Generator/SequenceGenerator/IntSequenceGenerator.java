package Generator.SequenceGenerator;

import Generator.Generator;

import java.util.Random;

public class IntSequenceGenerator implements Generator <Long>{
    Long rangeL,rangeR;
    int maxLen,cnt;
    Random random;
    public IntSequenceGenerator(int maxLen,Long rangeL,Long rangeR){
       setRange(rangeL,rangeR);
       random = new Random();
       this.maxLen = maxLen;
       this.cnt = 0;
    }
    public void setRange(Long rangeL,Long rangeR){
       this.rangeL = rangeL;
       this.rangeR = rangeR;
    }
    @Override
    public boolean hasNext(){
        return cnt < maxLen;
    }
    @Override
    public Long nextElemet(){
        cnt ++;
        return  (long) ((rangeR - rangeL) * random.nextDouble() + rangeL);
    }
}
