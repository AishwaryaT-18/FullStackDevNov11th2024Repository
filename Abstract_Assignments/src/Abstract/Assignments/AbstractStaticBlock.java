package Abstract.Assignments;
abstract class Demo1
{
    static
    {
        System.out.println("This is Static block");
    }
}
class Demo2 extends Demo1
{
    void show(int x, int y)
    {
        int res=x+y;
        System.out.println("Addition: "+res);
    }
}
public class AbstractStaticBlock {
    public static void main(String[] args) {
        Demo2 o=new Demo2();
        o.show(5,6);
    }
}
