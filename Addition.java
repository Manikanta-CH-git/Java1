
class Sum {
    public int add(int a,int b){
        return a*b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
}
public class Addition{
    public static void main(String[]args){
        Sum sum=new Sum();
        System.out.println(sum.add(1,8));
        System.out.println(sum.add(1.000,8.0000));
        System.out.println(sum.add(1.8,8.8));
        
    }
}
   
