class Main {
  public static void main(String[] args) {
    RemoteControl rc=new RemoteControl();
    Device car = new Device("car");
    Device robot = new Device("robot");
    Device tv= new Device("TV");
    rc.devices.add(car);
    rc.devices.add(robot);
    rc.devices.add(tv);
    
    Button b1=new Button(new TurnAllOn(rc.devices));
    Button b2=new Button(new TurnOn(robot));
    Button b3=new Button(new TurnOn(tv));
    Button b4=new Button(new TurnOff(car));

    rc.buttons.add(b1);
    rc.buttons.add(b2);
    rc.buttons.add(b3);
    rc.buttons.add(b4);
    b1.press();
  }
}