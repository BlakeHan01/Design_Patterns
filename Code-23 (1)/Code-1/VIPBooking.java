class VIPBooking extends Booking{
  VIPBooking(String d){
    this.date=d;
  }
  double cost(){
    return 200;
  }
}