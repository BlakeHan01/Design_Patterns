import java.util.*;
class Main {
  public static void main(String[] args) {
    Shape s;
    // s = ShapeFactory.getRandomShape();
    Scanner myScanner=new Scanner(System.in);
    System.out.println("What type of Shape you want?");
    String type=myScanner.next();
    try{
      s= ShapeFactory.getShape(type);
      s.draw();
    }catch(Exception e){
      System.out.println("This type is not available.");
    }
  }
}