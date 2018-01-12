package Test;

import Factory.GraphFactory;
import Factory.SequenceFactory;
import Generator.GraphGenerator.GraphGenerator;
import Generator.SequenceGenerator.DoubleSequenceGenerator;
import Generator.TreeGenerator.TreeGenerator;
import Generator.TreeGenerator.WeighedTreeGenerator;
import SupportTools.Edge;

import java.util.HashSet;

public class Test {
    static public void main(String [] args){
        GraphFactory factory = new GraphFactory(new GraphGenerator(3,3));
        factory.create();
        factory  = new GraphFactory(new WeighedTreeGenerator(5,0,10));
        factory.create();
    }
}
