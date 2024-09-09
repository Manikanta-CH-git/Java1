import java.util.Scanner;
class Box{
         int width;
         int height;
         int depth;}

public class M2{
    public static void main(String[]args){
        Box box1=new Box();
        int  vol;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter width");
        box1.width=sc1.nextInt();
        System.out.println("Enter height");
        box1.height=sc1.nextInt();
        System.out.println("Enter depth");
        box1.depth=sc1.nextInt();

        vol=box1.width*box1.height*box1.depth;
        System.out.println(vol);
    }
}


    
         

