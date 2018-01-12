package SupportTools;

import Generator.Generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class RandomEdge {
    Random random;
    HashSet<Edge> hasCreate;
    boolean isDirected = false;
    int maxVertex;
    public RandomEdge(int maxVertex){
       hasCreate = new HashSet<>();
       random = new Random();
       this.maxVertex = maxVertex;
    }
    public RandomEdge(int maxVertex,boolean isDirected){
        this(maxVertex);
        this.isDirected = isDirected;
    }
    public RandomEdge(int maxVertex,HashSet<Edge>hasCreate){
        this.maxVertex = maxVertex;
        random = new Random();
        this.hasCreate = hasCreate;
    }
    public RandomEdge(int maxVertex,HashSet<Edge>hasCreate,boolean isDirected){
        this(maxVertex,hasCreate);
        this.isDirected = isDirected;
    }
    public RandomEdge(int maxVertex,ArrayList<Edge>edgeStore){
        this.maxVertex = maxVertex;
        random = new Random();
        for(Edge e : edgeStore){
            hasCreate.add(new Edge(e.getU(),e.getV()));
            if(!isDirected)
                hasCreate.add(new Edge(e.getV(),e.getU()));
        }
    }
    public RandomEdge(int maxVertex,ArrayList<Edge>edgeStore,boolean isDirected){
        this(maxVertex,edgeStore);
        this.isDirected = isDirected;
    }
    public Edge nextElemet(){
        int u = random.nextInt(maxVertex) + 1;
        int v = random.nextInt(maxVertex) + 1;
        while(u == v || hasCreate.contains(new Edge(u,v))){
           u = random.nextInt(maxVertex) + 1;
           v = random.nextInt(maxVertex) + 1;
        }
        hasCreate.add(new Edge(u,v));
        if(!isDirected)
            hasCreate.add(new Edge(v,u));
        return new Edge(u,v);
    }
}
