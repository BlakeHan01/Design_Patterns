class PCBuilder extends ComputerBuilder{
  PCBuilder(){
    RAM = "64GB";
    CPU = "2GHz";
    Keyboard = "wired";
    Mouse = "wired";
    Speakers= "None";
  }
  public PCBuilder setKeyboard(String keyboard){
    this.Keyboard = keyboard;
    return this;
  }
  public PCBuilder setMouse(String mouse){
    this.Mouse = mouse;
    return this;
  }
  public Computer build(){
    Computer c=null;
    if(this.Keyboard !="built-in"){ /// verify that components are good
      c= new Computer(this);
    }
    return c;
  }
}