public class WilloughbyEngine extends engine
{
int last_service_mileage;
 int current_milag;
 public WilloughbyEngine(int current_mileage,int last_service_mileage)
 {
 this.last_service_mileage=last_service_mileage;
 this.current_milag=current_mileage;
 }
@Override
public boolean needs_service() 
    {
        if(current_milag<last_service_mileage)
        {
         return true;
        }
        else
        {
         return false;
        }

    } 
}
