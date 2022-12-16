class Main {
  public static void main(String[] args) {
    Mobile m= new Mobile();
    // m.setState(new Normal());
    m.setState(new Vibration());
    m.notify("New SMS Received..");
  }
}