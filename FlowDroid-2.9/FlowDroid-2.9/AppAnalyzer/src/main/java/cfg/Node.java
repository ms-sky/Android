package cfg;
import soot.SootMethod;
import soot.Unit;

import java.util.HashSet;

public class Node {
    public Unit unit;
    public String belongToMethod;//该语句所属的方法名
    public HashSet<Node> precursorNodes = new HashSet<>();//保存语句的直接前驱节点
    public HashSet<Node> successorNodes = new HashSet<>();//保存语句的后继
    public String tag;
    public boolean isExpand=false;//如果节点是方法，标记该处的方法是展开了

    public HashSet<Node> originPreNode=new HashSet<>();//用于保存最初始的前驱节点
    public HashSet<Node> originSuccorNode=new HashSet<>();//用于保存最初始的后继节点

    public Node(Unit unit,String belongToMethod) {
        this.unit = unit;
        this.belongToMethod=belongToMethod;
    }

    public Node(String tag) {
        this.tag = tag;
    }

    public String toString(){
        if(this.unit == null) return "<Null Unit>";
        return this.unit.toString();
    }


}
