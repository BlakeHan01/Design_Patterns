import java.util.*;
class GpaIterator extends Iterator{
  GpaIterator(ArrayList<Student> collection){
    this.items = (ArrayList<Student>)collection.clone();
  }
  public boolean hasNext(){
    return this.items.size()>0;
  }
  public Student getNext(){
    int max_index=-1;
    double max_gpa=-1;
    for(int i=0;i<this.items.size(); i++){
      if(this.items.get(i).gpa > max_gpa){
        max_gpa = this.items.get(i).gpa;
        max_index = i;
      }
    }
    Student s = this.items.get(max_index);
    this.items.remove(max_index);
    return s;
  }
}