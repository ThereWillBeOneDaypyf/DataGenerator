package Generator.GraphGenerator;

import Generator.Generator;
import SupportTools.Edge;
import SupportTools.RandomEdge;

public class GraphGenerator implements Generator<Edge>{
    int vertexNum,edgeNum;
    int cnt;
    RandomEdge edge;
    public GraphGenerator(int vertexNum,int edgeNum){
        this.edgeNum = edgeNum;
        this.vertexNum = vertexNum;
        edge = new RandomEdge(vertexNum);
        cnt = 0;
    }
    @Override
    public boolean hasNext(){
       return cnt < edgeNum;
    }
    @Override
    public Edge nextElemet(){
       cnt ++;
       return edge.nextElemet();
    }
}
