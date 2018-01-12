package Generator.TreeGenerator;

import Generator.Generator;
import Generator.SequenceGenerator.IntSequenceGenerator;

import java.util.ArrayList;
import java.util.Random;

import SupportTools.Edge;
public class WeighedTreeGenerator implements Generator<Edge>{
    private IntSequenceGenerator weighGenerator;
    private TreeGenerator edgeGenerator;
    ArrayList<Edge> edgeStore;
    Random random;
    public WeighedTreeGenerator(int vertexNum,long edgeRangeL,long edgeRangeR){
        edgeStore = new ArrayList<>();
        weighGenerator = new IntSequenceGenerator(vertexNum - 1,edgeRangeL,edgeRangeR);
        edgeGenerator = new TreeGenerator(vertexNum);
        random = new Random();
        for(int i = 2;i <= vertexNum;i++){
            edgeStore.add(new Edge(edgeGenerator.nextElemet(),i,weighGenerator.nextElemet()));
        }
    }
    @Override
    public boolean hasNext(){
        return !edgeStore.isEmpty();
    }
    @Override
    public Edge nextElemet(){
        int index = random.nextInt(edgeStore.size());
        Edge temp = edgeStore.get(index).copy();
        edgeStore.remove(index);
        return temp;
    }
}
