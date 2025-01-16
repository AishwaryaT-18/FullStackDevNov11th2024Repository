package Abstract.Assignments;
abstract class Demo
{
    {
        System.out.println("This is Instance block");
    }
    static
    {
        System.out.println("This is static block");
    }
}
public class AbstractInstanceBlock {
    public static void main(String[] args) {
        Demo o=new Demo() {};
    }
}
