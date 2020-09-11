import java.util.*;

public class Company
{
		 private String name,afm;
		 private long i;
		 private ArrayList<Employee> myEmployees=new ArrayList();
		
		//Constructor
		public Company(String n, String x)
		{
			name=n;
			afm=x;
		}
		
		public void addEmployee(Employee obj)
		{
			myEmployees.add(obj);
		}		
		public String getName()
		{
			return name;
		}
		public void setName(String x)
		{
			this.name=x;
		}
		public String getAfm()
		{
			return afm;
		}
		public void setAfm(String x)
		{
			this.afm=x;
		}
		public String getOneOnmyEmployeesName(int x)
		{
			return myEmployees.get(x).getName();
		}
}
