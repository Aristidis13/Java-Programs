import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		int i;
		List<Employee> employees = new ArrayList();
		SalariedEmployee salE1 = new SalariedEmployee("Nikos Patzios","72340002",3000);
		HourlyEmployee hE1 = new HourlyEmployee("Sofia Christou","98145000",210,20);
		employees.add(0,salE1);
		employees.add(1,hE1);
		for(i=0;i<2;i++)
		{
			System.out.println("Employee ID: "+ employees.get(i).getEmpId());
			System.out.println("Employee Name: "+employees.get(i).getName());
			System.out.println("Employee AFM: "+ employees.get(i).getAFM());
			System.out.println("Employee Payment: "+ employees.get(i).payment());
			System.out.println();
		}
		
		Company c1 = new Company("TalentSA","AFM=DIKO MOU");
		c1.addEmployee(salE1);
		c1.addEmployee(hE1);
		
		System.out.println("Employees working for "+c1.getName());
		System.out.println(c1.getOneOnmyEmployeesName(0));
		System.out.println(c1.getOneOnmyEmployeesName(1));
	}

}
