package designedPatern.observer.push;
 
import designedPatern.observer.push.display.diaplay;
import designedPatern.observer.push.observer.observer;

public class currentDisplay implements  diaplay ,   observer  {
	
	int temp ; 
	int humidity; 
	WeatherData weatherData;

	
	
	public currentDisplay(WeatherData weatherData)
	{
			this.weatherData = weatherData ;
			this.weatherData.resisterObserver(this);
	}

	@Override
	public void update( int humidity, int presure) {
		// TODO Auto-generated method stub
		    this.temp = temp ; 
		    this.humidity = humidity ;  
		    display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
			System.out.println(this.humidity+this.temp);
	}

}
