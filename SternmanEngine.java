public class SternmanEngine extends engine
{
   private boolean warning_light_on;
   
    SternmanEngine(boolean warning_light_on)
    {
    this.warning_light_on=warning_light_on;
    }
    @Override
   public  boolean needs_service()
       {
        return warning_light_on;
       }
     
}
