package designedPatern.observer.pull;

import java.util.Observable;
import java.util.Observer;

import designedPatern.observer.pull.display.diaplay; 

@SuppressWarnings("deprecation")
public class currentDisplay  implements diaplay , Observer{

	private int temp ; 
	private int humidity; 
	private Observable observable;
	
	public currentDisplay(Observable observable)
	{
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.humidity+this.temp);
	}

}
