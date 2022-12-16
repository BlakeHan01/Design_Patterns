class Main {
  public static void main(String[] args) {
    Patient p=new Patient("James", 40, 50, 140);
    Physician ph =new Physician("Mike");
    Dentist d= new Dentist("Alma");
    Nurse n = new Nurse("Sarah");
    p.attend(n);
  }
}