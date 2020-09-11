
public class HourlyEmployee extends Employee
{
	private int hoursWorked;
	private int hourlyPayment;
	
	//Constructor-2
	public HourlyEmployee(String n,String a,int hw,int hp)
	{
		super(n,a);
		hoursWorked=hw;
		hourlyPayment=hp;
	}
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	public void setHoursWorked(int s)
	{
		this.hoursWorked=s;
	}
	public int gethourlyPayment()
	{
		return hourlyPayment;
	}
	public void setHourlyPayment(int x)
	{
		this.hourlyPayment=x;
	}
	public int payment()
	{
		return hoursWorked*hourlyPayment;
	}

}
