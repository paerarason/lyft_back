public class CapuletEngine extends engine
{
 int last_service_mileage;
 int current_milag;
 /* (non-Javadoc)
 * @see engine#needs_service()
 */
CapuletEngine(int current_mileage,int last_service_mileage)
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