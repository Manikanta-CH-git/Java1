package estedclass
class Outer
{
    void display()
    {
        System.out.println("outer class display method");
    }
    class Inner
    {
        void display()
        {
        System.out.println("inner class display method");
        }
    }
}
public class NestedClass
{
    public static void main(String[] args)
    {
        Outer obj1=new Outer();
        obj1.display();
        Outer.Inner obj2=obj1.new Inner();
        obj2.display();
    }
}


