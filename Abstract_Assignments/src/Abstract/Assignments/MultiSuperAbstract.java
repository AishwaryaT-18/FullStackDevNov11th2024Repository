package Abstract.Assignments;
abstract class University
{
    abstract void UniId(int uniId);
    void Uni(String Uniname)
    {
        System.out.println("University:"+Uniname);
    }
}
class College extends University
{
    void UniId(int uniId)
    {
        System.out.println("University Id:"+uniId);
    }
    void Col(String uniname,String colname)
    {
        super.Uni(uniname);
        System.out.println("College:"+colname);
    }
}
class Student1 extends College
{
    void std(int UniId,String uniname,String colname ,String stdname,int id)
    {
        this.UniId(UniId);
        super.UniId(UniId);

        super.Col(uniname,colname);

        System.out.println("Student name:"+stdname);
        System.out.println("Std Id:"+id);
    }
}
public class MultiSuperAbstract {
    public static void main(String[] args) {
        Student1 o=new Student1();
        o.UniId(6393);
        o.std(76312,"VTU","VTU","Aish",06);
    }
}
