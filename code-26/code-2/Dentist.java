class Dentist implements Visitor{
  String name;
  Dentist(String n){name=n;}
  public void visit(Patient p){
    System.out.println("I am a dentist .. visiting patient"+p.getName());
  }
}