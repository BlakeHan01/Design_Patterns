class Patient{
  private String name;
  private int temperature;
  private int pulse_rate;
  private int blood_pressure;
  Patient(String n, int t, int p, int b){
    name=n;
    temperature = t;
    pulse_rate = p;
    blood_pressure = b;
  }
  String getName(){return name;}
  int getTemperature(){return temperature;}
  int getPulse_rate(){return pulse_rate;}
  int getBlood_pressure(){return blood_pressure;}
  void attend(Visitor v){
    v.visit(this);
  }
}