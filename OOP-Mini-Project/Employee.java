
public abstract class Employee
{
	private String name;
	private String afm;
	private long empId=0;
	private static long count;
	
	//Constructor-1
	public Employee(String n,String a)
	{
		name=n;
		afm=a;
		empId=++count;
	}
	
	public void setName(String newName)
	{
		this.name=newName;
	}
	public void setAFM(String newAFM)
	{
		this.afm=newAFM;
	}
	public String getAFM()
	{
		return afm;
	}
	public String getName()
	{
		return name;
	}
	public long getEmpId()
	{
		return empId;
	}
	public abstract int payment();
}
