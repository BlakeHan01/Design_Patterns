class Recording extends Decorator{
  boolean DVD;
  Recording(Booking b, boolean dvd){
    booking = b;
    DVD = dvd;
  }
  double cost(){
    return booking.cost()+25;
  }
}