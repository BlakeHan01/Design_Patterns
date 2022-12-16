import java.util.*;
class WeatherService implements Subject{
  public int temperature;
  private static List<Observer> subscribers = new ArrayList<Observer>();
  public void subscribe(Observer o){
    if(!subscribers.contains(o)){
      subscribers.add(o);
    }
  }
  public void unsubscribe(Observer o){
    if(subscribers.contains(o)){
      subscribers.remove(o);
    }
  }
  public void notify_subscribers(){
    for(Observer o: subscribers){
      o.notify("Temperature now is:"+this.temperature);
    }
  }
}