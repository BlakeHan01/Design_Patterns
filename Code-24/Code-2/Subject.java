interface Subject{
  abstract public void subscribe(Observer o);
  abstract public void unsubscribe(Observer o);
  abstract public void notify_subscribers();
}