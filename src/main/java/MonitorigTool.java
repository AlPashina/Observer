public class MonitorigTool implements Subscriber{
    String devID="";
    double temperature; //температура
    double pressure; //давление
    double humidity; //влажность

    MonitorigTool( String devID,double temperature, double pressure, double humidity){
        this.devID=devID;
        this.temperature= temperature;
        this.pressure= pressure;
        this.humidity= humidity;
    }

    @Override
    public void notify(double temperature, double pressure, double humidity) {
        System.out.println("Устройство "+devID) ;
        if((Math.abs(this.temperature- temperature)<1) &&(Math.abs(this.pressure- pressure)<1) &&(Math.abs(this.humidity- humidity)<1))
        {
            System.out.println("  Показатели не изменились") ;
        }
        if (Math.abs(this.temperature- temperature)>=1){
            this.temperature= temperature;
            System.out.println("  Температура "+Double.toString(temperature)) ;
        }
        if (Math.abs(this.pressure- pressure)>=1){
            System.out.println("  Давление "+Double.toString(pressure)) ;
        }
        if (Math.abs(this.humidity- humidity)>=1) {
            System.out.println("  Влажность " + Double.toString(humidity));
        }
        this.temperature= temperature;
        this.pressure= pressure;
        this.humidity= humidity;
        System.out.println("---------------------------");
    }
}
