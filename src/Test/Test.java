package Test;

import Factory.GraphFactory;
import Generator.GraphGenerator.GraphGenerator;
import Generator.TreeGenerator.WeighedPointTreeGenerator;

public class Test {
    static public void main(String [] args){
        GraphFactory factory = new GraphFactory(new GraphGenerator(3,3));
        factory.create();
        factory  = new GraphFactory(new WeighedPointTreeGenerator(5,0,10));
        factory.create();
    }
}
