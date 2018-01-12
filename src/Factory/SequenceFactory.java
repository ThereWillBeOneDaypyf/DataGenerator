package Factory;

import Generator.Generator;

public class SequenceFactory {
    private Generator generator;
    public SequenceFactory(Generator generator){
       this.generator = generator;
    }
    public void create(){
        System.out.print(generator.nextElemet());
        while(generator.hasNext()){
            System.out.print(" " + generator.nextElemet());
        }
        System.out.println();
    }
}
