abstract class ComputerBuilder{
  public String RAM;
  public String CPU;
  public String Keyboard;
  public String Mouse;
  public String Speakers;
  public ComputerBuilder setRAM(String ram){
    this.RAM = ram;
    return this;
  }
  public ComputerBuilder setCPU(String cpu){
    this.CPU = cpu;
    return this;
  }
  abstract public Computer build();
}