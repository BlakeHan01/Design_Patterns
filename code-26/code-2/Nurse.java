class Nurse implements Visitor{
  String name;
  Nurse(String n){name=n;}
  public void visit(Patient p){
    System.out.println("I am a Nurse .. visiting patient "+p.getName());
    if(p.getTemperature()==37){
      System.out.println("Patient has normal temperature");
    }else if(p.getTemperature()>37){
      System.out.println("Patient has high temperature");
    }else{
      System.out.println("Patient has low temperature");
    }
  }
}