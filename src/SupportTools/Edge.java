package SupportTools;

public class Edge {
    private int u,v;
    private long w;
    private boolean hasw = false;
    public Edge(int u,int v,long w){
        this.u = u;
        this.v = v;
        this.w = w;
        this.hasw = true;
    }
    public Edge(int u,int v){
        this.u = u;
        this.v = v;
        this.hasw = false;
    }
    public int getU(){
        return u;
    }
    public int getV(){
        return v;
    }
    public long getW(){
        return w;
    }
    public Edge copy(){
       Edge another = new Edge(this.u,this.v,this.w);
       return another;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Edge))
            return false;
        Edge temp = (Edge) obj;
        if(temp.getU() != this.u || temp.getV() != this.v || this.hasw != temp.hasw)
            return false;
        if(this.hasw == true && this.w != temp.getW())
            return false;
        return true;
    }
    @Override
    public int hashCode(){
        int MOD = (int)1e9 + 7;
        long temp = u * v % MOD;
        int flag = hasw ? 1 : 0;
        temp = temp * ((int)(flag * w) % MOD) % MOD;
        return (int) temp % MOD;
    }
    @Override
    public String toString(){
        String s = "";
        s += Integer.toString(u);
        s += " ";
        s += Integer.toString(v);
        if(hasw)
            s += " " + Long.toString(w);
        return s;
    }
}
