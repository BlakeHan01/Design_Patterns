class TurnOff extends Command{
  Device device;
  TurnOff(Device d){device =d;}
  public void execute(){
    device.shutDown();
  } 
}