package Abstract.Assignments;
abstract class Grandpa
{
    void Gname(String gname)
    {
        System.out.println("Grandpa Name:"+gname);
    }
}
class Pappa1 extends Grandpa
{
    void pa1(String gname, String p1name)
    {
        super.Gname(gname);
        System.out.println("Pappa1 name:"+p1name);
    }
}
class Pappa2 extends Grandpa
{
    void  pa2(String gname, String p2name)
    {
        super.Gname(gname);
        System.out.println("Pappa2 name:"+p2name);
    }
}
class Son extends Pappa1
{
    void son(String gname, String p1name, String sonname)
    {

        super.pa1(gname,p1name);
        System.out.println("son of "+p1name+": "+ sonname);
    }
}
public class HybridSuperAbstract {
    public static void main(String[] args) {
        Son o=new Son();
        o.son("Ambani","Anil Ambani","Anant Ambani");
        Pappa2 o2=new Pappa2();
        o2.pa2("Ambani","Mukhesh Ambani");
    }
}
