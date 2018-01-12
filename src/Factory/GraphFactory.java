package Factory;

import Generator.Generator;
import Generator.GraphGenerator.GraphGenerator;

public class GraphFactory {
    private Generator generator;
    public GraphFactory(Generator generator){
        this.generator = generator;
    }
    public void create(){
        while(generator.hasNext()){
            System.out.println(generator.nextElemet());
        }
    }
}
