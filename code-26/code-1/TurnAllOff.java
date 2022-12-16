import java.util.*;
class TurnAllOff extends Command{
  ArrayList<Device> devices;
  TurnAllOff(ArrayList<Device> ds){devices =ds;}
  public void execute(){
    for(Device d:devices)
      d.shutDown();
  } 
}