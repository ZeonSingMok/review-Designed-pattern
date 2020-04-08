package designedPatern.observer.pull;

import java.util.Observable;
import java.util.Observer;

import designedPatern.observer.pull.display.diaplay;

public class forecastDisplay   implements  diaplay , Observer 
{
	
		private  float currentPersure = 29.92f;
		private  float lastPersure ; 
		private  Observable  obs; 
		
		public forecastDisplay(Observable  obs)
		{
			this.obs =obs;
			obs.addObserver(this);
		}
		
		
		
	@Override
	public void update(Observable o, Object arg) {
		 	if (o instanceof  WeatherData)
		 	{
		 		WeatherData weatherData = (WeatherData) o;
	 			this.lastPersure = this.currentPersure;
		 			this.currentPersure = weatherData.getPresure(); 
				 	display();
		 	}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.lastPersure+""+this.currentPersure);
	}
	
}
