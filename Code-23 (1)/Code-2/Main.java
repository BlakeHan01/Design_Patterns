class Main {
  public static void main(String[] args) {
    Computer c;
    // c=new Laptop("128GB","1GHz", new Macos());
    c=new Desktop("128GB","1GHz","wireless","wireless",new Linux());
    c.turnOn();
    System.out.println("After some time...........");
    c.turnOff();
  }
}