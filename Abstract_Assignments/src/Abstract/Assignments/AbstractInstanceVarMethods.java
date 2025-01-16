package Abstract.Assignments;
abstract class Maths1
{
    int x;
    int y;
    int addition(int a, int b)
    {
        this.x=a;
        this.y=b;
        int res=x+y;
        System.out.println("Addition Result:"+res);
        return res;
    }
    {
        System.out.println("This is Instance Block");
    }
}
public class AbstractInstanceVarMethods {
    public static void main(String[] args) {
        Maths1 o=new Maths1() {};
        o.addition(2,3);
    }
}
