package designedPatern.observer.push.subject;

import designedPatern.observer.push.observer.observer;

public interface subject {
  public void  resisterObserver(observer  o); 
  public void  removeObserver(observer  o); 
  public void  notifyObserver();
  
  
  
}
