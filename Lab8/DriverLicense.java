import java.util.*;
public class DriverLicense extends Card {
  private int expYear;
  
  public DriverLicense(String name, int year) {
    super(name);
    this.expYear = year;
  }

  public String format() {
    return super.format() + " Year Of Expiration: " + expYear;
  }

  @Override
  public boolean isExpired() {
    GregorianCalendar calendar = new GregorianCalendar();
    int currentYear = calendar.get(Calendar.YEAR);
    if(expYear < currentYear)     // i.e. 2019 is less than 2020, hence expired
      return true;
    else                          // i.e. 2021 is greater than 2020, hence not expired
      return false;
  }

  public String toString(){
    return "DriversLicense[name=" + this.getName() + "][Expiration Year="+ this.expYear + "]";
  }

  @Override
  public boolean equals(Object obj)
  {
    DriverLicense driverLicense = (DriverLicense) obj;      // cast
    return (super.equals(driverLicense) && this.expYear == driverLicense.expYear);    // check to see if cards are equal
  }
}