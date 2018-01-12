package Generator.SequenceGenerator;

import Generator.Generator;

import java.util.Random;

public class DoubleSequenceGenerator implements Generator<Double>{
    Double rangeL,rangeR;
    int maxLen,cnt;
    Random random;
    public DoubleSequenceGenerator(int maxLen,Double rangeL,Double rangeR){
       setRange(rangeL,rangeR);
       random = new Random();
       this.maxLen = maxLen;
       this.cnt = 0;
    }
    public void setRange(Double rangeL,Double rangeR){
       this.rangeL = rangeL;
       this.rangeR = rangeR;
    }
    @Override
    public boolean hasNext(){
        return cnt < maxLen;
    }
    @Override
    public Double nextElemet(){
        cnt ++;
        return  ((rangeR - rangeL) * random.nextDouble() + rangeL);
    }
}
