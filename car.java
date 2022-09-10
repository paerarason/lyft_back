public  class car implements serverlet
{
  public battery B1;
  public engine E1;
  public car(engine e1,battery b1)
  {
   B1=b1;
   E1=e1;
  }
  
 public car() {
  }
public boolean needs_service()
 {
  if(B1.needs_service()|| E1.needs_service() )
  {
    return true;
  }
  else{
    return false;
  }
 }
}
