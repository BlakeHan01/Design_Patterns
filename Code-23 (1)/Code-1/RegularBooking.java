class RegularBooking extends Booking{
  RegularBooking(String d){
    this.date=d;
  }
  double cost(){
    return 100;
  }
}