import java.util.Date;
public class carFactory 
{
    public car   create_calliope(Date current_date,Date last_service_date,int current_mileage,int last_service_mileage)
    {
     engine new_engine=new CapuletEngine(current_mileage,last_service_mileage);
     battery new_battrey=new SpindlerBattery(current_date,last_service_date);
     car new_car=new car(new_engine,new_battrey);
     return new_car;
    }


    public  car create_glissade(Date current_date,Date last_service_date,int current_mileage,int last_service_mileage)
    {
        engine new_engine=new CapuletEngine(current_mileage,last_service_mileage);
        battery new_battrey=new NubbinBattery(current_date,last_service_date);
        car new_car=new car(new_engine,new_battrey);
        return new_car;
    } 



    public car create_palindrome(Date current_date,Date last_service_date, boolean warning_light_on)
    {
      engine new_engine=new SternmanEngine(warning_light_on);
      battery new_battrey=new SpindlerBattery(current_date,last_service_date);
      car new_car=new car(new_engine,new_battrey);
     return new_car;
    } 



    public  car create_rorschach( Date current_date,Date last_service_date, int current_mileage,int  last_service_mileage)
    { 
        engine new_engine=new WilloughbyEngine(current_mileage,last_service_mileage);
        battery new_battrey=new NubbinBattery(current_date,last_service_date);
        car new_car=new car(new_engine,new_battrey);
        return new_car;

    } 

    public car create_thovex(Date current_date,Date last_service_date, int current_mileage, int last_service_mileage)
    {
        
        engine new_engine=new CapuletEngine(current_mileage,last_service_mileage);
        battery new_battrey=new NubbinBattery(current_date,last_service_date);
        car new_car=new car(new_engine,new_battrey);
        return new_car;
        
    }
}
