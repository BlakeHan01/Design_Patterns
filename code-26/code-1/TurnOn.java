class TurnOn extends Command{
  Device device;
  TurnOn(Device d){device =d;}
  public void execute(){
    device.startUp();
  } 
}