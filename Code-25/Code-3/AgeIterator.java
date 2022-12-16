import java.util.*;
class AgeIterator extends Iterator{
  AgeIterator(ArrayList<Student> collection){
    this.items = (ArrayList<Student>)collection.clone();
  }
  public boolean hasNext(){
    return this.items.size()>0;
  }
  public Student getNext(){
    int max_index=-1;
    int max_age=-1;
    for(int i=0;i<this.items.size(); i++){
      if(this.items.get(i).age > max_age){
        max_age = this.items.get(i).age;
        max_index = i;
      }
    }
    Student s = this.items.get(max_index);
    this.items.remove(max_index);
    return s;
  }
}