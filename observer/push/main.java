package designedPatern.observer.push;

/*
 *  push mode  
 *  
 *  the  subjecter   'pull' data to observers  
 * */

public class main
{
	public static void main(String[] arg) {
		 WeatherData weatherData = new WeatherData() ; 
	  
		 currentDisplay  currDisplay = new currentDisplay(weatherData); 
		  
		 weatherData.setMeasurements(80, 50, 10);
	}
}
