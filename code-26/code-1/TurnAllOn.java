import java.util.*;
class TurnAllOn extends Command{
  ArrayList<Device> devices;
  TurnAllOn(ArrayList<Device> ds){devices =ds;}
  public void execute(){
    for(Device d:devices)
      d.startUp();
  } 
}