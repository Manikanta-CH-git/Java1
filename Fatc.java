class Factorial{
     int factorial(int n){
        if(n==0){
            return 1;
        }
        else
        {
        return n*factorial(n-1);
        }
    }
}

public class Fatc {
    public static void main(String[]args){
        Factorial fact=new Factorial();
        int number=10;
        int result=fact.factorial(number);
    
    System.out.println( number + result);
    }
    
}
