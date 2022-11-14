import java.util.Random;

public class WeatherStation extends Publisher{
    double temperature; //температура
    double pressure; //атмосферное давление
    double humidity; //относительная влажность

    void WeatherChange(int times,int milisec) throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            this.temperature =Math.round(((Math.random()*((25+20)+ 1)) -20)*100.0)/ 100.0;
            this.pressure =Math.round(((Math.random()*((755-743)+ 1)) +743)*100.0)/ 100.0;
            this.humidity=Math.round(((Math.random()*((100-5)+ 1)) +5)*100.0)/ 100.0;
            notifyObservers(temperature,pressure,humidity);
            Thread.sleep(milisec);
        }
    }
}
