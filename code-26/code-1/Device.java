class Device{
  String name;
  Device(String n){name=n;}
  void startUp(){
    System.out.println(this.name+" is starting up now..");
  }
  void shutDown(){
    System.out.println(this.name+" is shutting up now..");
  }
}