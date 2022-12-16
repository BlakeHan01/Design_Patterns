class Catering extends Decorator{
  String food_type;
  Catering(Booking b, String ft){
    booking=b;
    food_type=ft;
  }
  double cost(){
    return booking.cost() + 50;
  }
}