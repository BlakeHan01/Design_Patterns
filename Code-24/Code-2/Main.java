class Main {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    Phone p2 = new Phone();
    Ipad i1 = new Ipad();
    Ipad i2 = new Ipad();
    WeatherService ws = new WeatherService();
    ws.temperature = 30;

    ws.subscribe(p1);
    ws.subscribe(p2);
    ws.subscribe(i1);
    ws.subscribe(i2);

    ws.notify_subscribers();
  }
}