import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class Box{
         int width;
         int height;
         int depth;}

public class M3{
    public static void main(String[]args) throws IOException{
        Box box1=new Box();
        int  vol;
        File f1=new File("in1.txt");
        Scanner sc1=new Scanner(f1);
        box1.width=sc1.nextInt();
        box1.height=sc1.nextInt();
        box1.depth=sc1.nextInt();

        vol=box1.width*box1.height*box1.depth;
        System.out.println(vol);
    }
}


    
         

