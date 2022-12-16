import java.util.*;
class Main {
  public static void main(String[] args) {
    Shape s;
    Random rnd = new Random();
    int shape_choice=rnd.nextInt(2);
    int color_choice=rnd.nextInt(2);
    if(shape_choice==0){
      if(color_choice==0){
        s =new Circle("Blue");
      }else{
        s= new Circle("Red");
      }
    }else{
      if(color_choice==0){
        s =new Rectangle("Blue");
      }else{
        s= new Rectangle("Red");
      }
    }
    System.out.print("The generated shape is:");
    System.out.println(s);
    Shape copy;
    copy= s.clone();
    System.out.print("The copy shape is:");
    System.out.println(copy);
  }
}