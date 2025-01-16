package Abstract.Assignments;
abstract class Student
{
    static void std(String name)
    {
        System.out.println("Name:"+name);
    }
    static void Id( int Id)
    {
        System.out.println("Id: "+Id);
    }
}
public class Abstract2StaticMethod
{
    public static void main(String[] args)
    {
        Student.std("Aishwarya");
        Student.Id(06);
    }
}
