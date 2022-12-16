class LaptopBuilder extends ComputerBuilder{
  LaptopBuilder(){
    RAM = "32GB";
    CPU = "1.5GHz";
    Keyboard = "built-in";
    Mouse = "built-in";
    Speakers ="built-in";
  }
  public Computer build(){
    return new Computer(this);
  }
}