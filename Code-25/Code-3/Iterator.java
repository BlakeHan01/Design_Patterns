import java.util.*;
abstract class Iterator{
  int currentIndex;
  List<Student> items;
  abstract public boolean hasNext();
  abstract public Student getNext();
}