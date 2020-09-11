
public class SalariedEmployee extends Employee
{
	private  int salary;
	//Constructor-1
	public SalariedEmployee(String n,String a, int s)
	{
		super(n,a);
		salary=s;
	}
	public void setSalary(int newsalary)
	{
		this.salary=newsalary;
	}
	public int payment()
	{
		return salary;
	}

}
