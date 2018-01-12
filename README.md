# DataGenerator

### DataGenerator for SHUOJ Problems
* 自定义类型
    * Edge类
* 构造器
    * 序列
        * 普通序列
        * 排列
    * 图
        * 树
            * 无权树
            * 点权树
            * 边权树
        * 连通图
            * 无权连通图
            * 点权连通图
            * 边权连通图
        * 一般图
            * 无权一般图
            * 点权一般图
            * 边权连通图
* 辅助工具
    * 边集生成器
### 自定义类型
#### Edge类
```
SupportTools.Edge类 本身不区分有向无向，只区别是否带权
```
> * 构造函数：
>    * Edge(int u,int v)：一条u,v相关联的边不带权
>    * Edge(int u,int v,long w)：一条u,v相关联的边带权
> * 公共方法：
>    * int getU(),int getV()：返回端点u,v的编号
>    * boolean getHasW()：返回是否带权值
>    * int getW()：返回权值
>    * Edge copy()：返回一个引用，作为当前对象的副本
>    * int hashCode()：覆写用于HashSet判断相等
>    * boolean equals()：覆写用于判断HashSet判断相等
>    * String toString()：覆写按照格式输出，
有权值输出"u v w"，无权值输出"u v"
### 构造器
#### 序列
##### 生成普通序列
```
Generator.SequenceGenerator.IntSequenceGenerator类 整数序列
Generator.SequenceGenerator.Double类 浮点数序列
```
> * 使用范围：生成n个在`[`rangL,rangR`]`之间的数字
> * 构造参数：(个数，范围左端点，范围右端点)
> * 实例：
> <br/>IntSequenceGenerator isg =  <br/>
　　　　new IntSequeceGenerator(n,rangeL,rangeR);

##### 排列
```
Generator.PermutationGenerator.PermutationGenerator类 随机排列
```
> * 使用范围：生成1-n的n元排列
> * 构造参数：(个数)
> * 实例：
> <br/> PermutationGenerator pg = <br/>
　　　　new PermutationGenerator(n);
#### 图
##### 树
###### 无权树
```
Generator.TreeGenerator.TreeGenerator类 无权树
```
> * 使用范围：生成n个节点的树
> * 构造参数：(节点个数)
> * 实例：
> <br/> TreeGenerator tg = new TreeGenerator (n);
###### 点权树
```
Generator.TreeGenerator.WeighedPointTreeGenerator类 点权树
```
> * 使用范围：生成n个节点，点权范围在整数`[`rangeL,rangeR`]`的树
> * 构造参数：(节点个数，范围左端点，范围右端点)
> * 实例：
> <br/> WeighedPointTreeGenerator wpt = <br/>
　new WeighedPointTreeGenerator(n,rangeL,rangeR);
##### 一般图
###### 无权一般图
```
Generator.GraphGenerator.GraphGenerator类 无权一般图
```
> * 使用范围：生成n个点m条边的一般图<b>(不保证连通)</b>,
可用isDirected(boolean)来规定有向图或者无向图
> * 构造参数：(点数，边数) (点数，边数，有/无向)
> * 实例：
> <br/> GraphGenerator gg = new GraphGenerator(n,m,false);
> <br/> n个点m条边的无向图
###### 带权一般图
##### 连通图
###### 无权连通图
###### 有权连通图

### 辅助工具
#### 边集生成器
```
SupportTools.RandomEdge类 边集随机生成器
```
> * 使用范围：针对n个点的有向或者无向图生成无重边的边集或者往
已存在的边集中继续生成边
> * 构造参数：(节点个数，`[`是否为有向图`]`)，<br/>
> 　　　　　(节点个数，HashSet，`[`是否为有向图`]`),<br/>
> 　　　　　(节点个数，ArrayList,`[`是否为有向图`]`)<br/>
> ```
>   其中[]中为可选参数，类型为boolean
>   HashSet或者ArrayList类型为Edge，存储已生成的边集
> ```
> * 实例：RandomEdge re = new RandomEdge(n,true);