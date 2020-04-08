package designedPatern.observer.pull;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class WeatherData extends  Observable
{
	private int temp; 
	private int  humidity; 
	private float  presure; 
	
	
	public WeatherData() {} ; 
	 
	public void measurementsChanged()
	{ 
		  setChanged(); 
		  notifyObservers();
	}

	public void  setMeasurements(int temp , int humidity, float presure)
	{
		this.humidity = humidity ; 
		this.temp = temp ; 
		this.presure = presure ;  
		 measurementsChanged();
	}
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public float getPresure() {
		return presure;
	}

	public void setPresure(float presure) {
		this.presure = presure;
	}  
	
}
