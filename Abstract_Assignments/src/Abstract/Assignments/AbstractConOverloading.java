package Abstract.Assignments;
abstract class Employee
{
    Employee(String name)
    {
        System.out.println("Emp Name:"+name);
    }
    Employee(int id)
    {
        System.out.println("Employee Id:"+id);
    }
}
public class AbstractConOverloading
{
    public static void main(String[] args)
    {
        Employee e=new Employee("Aish"){};
        Employee e2=new Employee(06) {};
    }
}
