package designedPatern.observer.pull;

public class main {
	public static void main(String[] arg) 
	{
			WeatherData weatherData =new WeatherData(); 
			
			forecastDisplay  f = new forecastDisplay(weatherData);
			currentDisplay c =new currentDisplay(weatherData);
			 
			weatherData.setMeasurements(80, 65, 30.4f);
	}
}
