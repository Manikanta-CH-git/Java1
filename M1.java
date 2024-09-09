class Box{
         double width;
         double height;
         double depth;}
public class M1{
    public static void main(String[]args){
        Box box1=new Box();
        Box box2=new Box();
        double vol;

        box1.width=Double.parseDouble(args[0]);
        box1.height=Double.parseDouble(args[1]);
        box1.depth=Double.parseDouble(args[2]);

        box2.width=3;
        box2.height=6;
        box2.depth=9;

        vol=box1.width*box1.height*box1.depth;
        System.out.println(vol);

        vol=box2.width*box2.height*box2.depth;
        System.out.println(vol);}}

    
         

