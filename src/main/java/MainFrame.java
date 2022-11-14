
public class MainFrame {

    public static void main(String[] args) throws InterruptedException {
        WeatherStation ws=new WeatherStation();
        MonitorigTool device1=new MonitorigTool("Монитор1" ,10,740,50);
        MonitorigTool device2=new MonitorigTool("Монитор2" ,10,740,50);
        ws.subscribe(device1);
        ws.subscribe(device2);
        ws.WeatherChange(4,1000);
        ws.unsubscribe(device1);
        ws.unsubscribe(device2);
    }
}
