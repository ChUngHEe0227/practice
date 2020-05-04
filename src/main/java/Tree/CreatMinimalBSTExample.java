package Tree;

public class CreatMinimalBSTExample {
    public MyNode CreatMinimalBST(int[] ary){
        return CreatMinimalBST(ary,0,ary.length-1);
    }
    public MyNode  CreatMinimalBST(int[] ary,int startpoint,int endPoint){
        if(endPoint<startpoint){
            return null;
        }
        int midPoint = (startpoint+endPoint)/2;
        MyNode n = new MyNode(ary[midPoint]);
        n.leftNode = CreatMinimalBST(ary,0,midPoint-1);
        n.rightNode=CreatMinimalBST(ary,midPoint+1,endPoint);
        return n;
    }
}
