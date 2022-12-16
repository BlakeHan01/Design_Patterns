import java.util.*;
class ShapeFactory{
  public static Shape getRandomShape(){
    Random rnd=new Random();
    Shape shape;
    int choice = rnd.nextInt(3);
    if(choice == 0){
      shape =  new Circle();
    }else if(choice == 1){
      shape = new Triangle();
    }else{
      shape = new Rectangle();
    }
    return shape;
  }
  public static Shape getShape(String type){
    Shape shape;
    if(type.equals("circle")){
      shape = new Circle();
    }else if (type.equals("rectangle")){
      shape = new Rectangle();
    }else{
      shape = new Triangle();
    }
    return shape;
  }
}