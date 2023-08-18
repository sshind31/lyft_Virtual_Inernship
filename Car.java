import java.util.*;
interface IServicable
{
	boolean needs_service();
}

class Car implements IServicable
{
	private Engine engine;
	private Battery battery;
	
	public void setEngine(Engine _engine)
	{
		engine=_engine;
	}
	
	public Engine getEngine()
	{
		return engine;
	}
	
	public void setBattery(Battery _battery)
	{
		battery=_battery;
	}
	
	public Battery getBattery()
	{
		return battery;
	}
	
	public boolean needs_service()
	{
		return engine.needs_service() || battery.needs_service();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Succ");
	}
}
interface Engine extends IServicable{}
interface Battery extends IServicable{}

class CapuletEngine implements Engine
{
	private int last_service_mileage;
	
	private int current_milage;
	
	public void setlast_service_mileage(int _last_service_mileage)
	{
		last_service_mileage=_last_service_mileage;
	}
	
	public void setcurrent_milage(int _current_milage)
	{
		current_milage=_current_milage;
	}
	
	public int getlast_service_mileage(int _last_service_mileage)
	{
		return last_service_mileage;
	}
	
	public int getcurrent_milage(int _current_milage)
	{
		return current_milage;
	}
	
	public boolean needs_service()
	{
		return current_milage-last_service_mileage>30000;
	}
}
class WilloughbyEngine implements Engine
{
	private int last_service_mileage;
	
	private int current_milage;
	
	public void setlast_service_mileage(int _last_service_mileage)
	{
		last_service_mileage=_last_service_mileage;
	}
	
	public void setcurrent_milage(int _current_milage)
	{
		current_milage=_current_milage;
	}
	
	public int getlast_service_mileage(int _last_service_mileage)
	{
		return last_service_mileage;
	}
	
	public int getcurrent_milage(int _current_milage)
	{
		return current_milage;
	}
	
	public boolean needs_service()
	{
		return current_milage-last_service_mileage>60000;
	}
}
class SternmanEngine implements Engine
{
	private boolean warning_light_on;
	
	public void setwarning_light_on(boolean _warning_light_on)
	{
		warning_light_on=_warning_light_on;
	}
	
	public boolean getwarning_light_on(int _current_milage)
	{
		return warning_light_on;
	}
	
	public boolean needs_service()
	{
		return warning_light_on;
	}
}
class SpindlerBattery implements Battery
{
	private Calendar last_service_Date;
	
	private Calendar current_Date;
	
	public void setlast_service_Date(Calendar _last_service_Date)
	{
		last_service_Date=_last_service_Date;
	}
	
	public void setcurrent_Date(Calendar _current_Date)
	{
		current_Date=_current_Date;
	}
	
	public Calendar getlast_service_Date(Calendar _last_service_Date)
	{
		return last_service_Date;
	}
	
	public Calendar getcurrent_Date(Calendar _current_Date)
	{
		return current_Date;
	}
	
	public boolean needs_service()
	{
		return current_Date.get(Calendar.YEAR)-last_service_Date.get(Calendar.YEAR)>2;
	}	
}
class NubbinBattery implements Battery
{
	private Calendar last_service_Date;
	
	private Calendar current_Date;
	
	public void setlast_service_Date(Calendar _last_service_Date)
	{
		last_service_Date=_last_service_Date;
	}
	
	public void setcurrent_Date(Calendar _current_Date)
	{
		current_Date=_current_Date;
	}
	
	public Calendar getlast_service_Date(Calendar _last_service_Date)
	{
		return last_service_Date;
	}
	
	public Calendar getcurrent_Date(Calendar _current_Date)
	{
		return current_Date;
	}
	
	public boolean needs_service()
	{
		return current_Date.get(Calendar.YEAR)-last_service_Date.get(Calendar.YEAR)>4;
	}
}