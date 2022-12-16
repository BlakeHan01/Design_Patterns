abstract class Computer{
  String RAM;
  String CPU;
  String kb;
  String mouse;
  OS os;
  void turnOn(){
    os.startup();
    os.run();
  }
  void turnOff(){
    os.shutdown();
  }
}