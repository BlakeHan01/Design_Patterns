class Computer{
  public String RAM;
  public String CPU;
  public String Keyboard;
  public String Mouse;
  public String Speakers;

  Computer(ComputerBuilder cb){
    this.RAM = cb.RAM;
    this.CPU= cb.CPU;
    this.Keyboard = cb.Keyboard;
    this.Mouse = cb.Mouse;
    this.Speakers = cb.Speakers;
  }
  public String toString(){
    String txt="";
    txt+="RAM: "+ this.RAM +"\n";
    txt+="CPU: "+ this.CPU +"\n";
    txt+="Keyboard: "+ this.Keyboard +"\n";
    txt+="Mouse: "+ this.Mouse +"\n";
    return txt;
  }
}