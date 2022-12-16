import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Student> students=new ArrayList<Student>();
    students.add(new Student("james",25, 2.7));
    students.add(new Student("alma",20, 3.7));
    students.add(new Student("sarah",21, 3.9));
    students.add(new Student("sedra",27, 4.0));
    students.add(new Student("mike",30, 3.1));
    // AgeIterator ai= new AgeIterator(students);
    GpaIterator ai= new GpaIterator(students);
    while(ai.hasNext()){
      System.out.println(ai.getNext().name);
    }
  }
}