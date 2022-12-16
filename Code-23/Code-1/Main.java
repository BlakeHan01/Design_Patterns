class Main {
  public static void main(String[] args) {
    Booking b;
    b= new VIPBooking("01/01/2023");
    // b= new Catering(b, "Veg");
    b= new Recording(b,true);
    System.out.println(b.cost());
  }
}