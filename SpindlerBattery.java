import java.util.Date;
public class SpindlerBattery extends battery
{
public Date last_service_date;
public Date current_date;
SpindlerBattery(Date current_date,Date last_service_date)
{
  this.current_date=current_date;
  this.last_service_date=last_service_date;
}
@Override
public boolean needs_service()
    {  
      return true;
    }
}
