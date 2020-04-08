package designedPatern.observer.push;

import java.util.ArrayList; 
import designedPatern.observer.push.observer.observer;
import designedPatern.observer.push.subject.subject;

public class WeatherData  implements  subject{

	private ArrayList<observer> observers; 
	private int temp; 
	private int  humidity; 
	private int  presure; 
		   
	public WeatherData() {
		 observers = new ArrayList<observer>();
	}

	@Override
	public void resisterObserver(observer  o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(observer  o) {
		// TODO Auto-generated method stub
		if (observers.indexOf(o) >=0 ) observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (observer observer : observers) {
			   observer.update(this.humidity,this.presure);
		}
	}

	public void measurementsChanged()
	{
		notifyObserver();
	} 
	
	public void  setMeasurements(int temp , int humidity, int presure)
	{
		this.humidity = humidity ; 
		this.temp = temp ; 
		this.presure = presure ;  
	}
	
}
