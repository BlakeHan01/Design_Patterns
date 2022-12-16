class Physician implements Visitor{
  String name;
  Physician(String n){name=n;}
  public void visit(Patient p){
    System.out.println("I am a Physician .. visiting patient "+p.getName());
    if(p.getBlood_pressure() ==140){
      System.out.println("Patient has normal blood pressure");
    }else if(p.getBlood_pressure()>160){
      System.out.println("Patient has high blood pressure");
    }else{
      System.out.println("Patient has low blood pressure");
    }
  }
}