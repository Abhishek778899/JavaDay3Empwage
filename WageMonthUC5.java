
public class WageMonth 
{

	public static void main(String[] args) 
	{
		int totalSalary = 0;
		  int empRatePerHr = 20;
		  int empWorkingDays = 20;
		  int empHr,salary;
		  int day;
		  for(day = 1;day <= empWorkingDays;day++) {
			  double empCheck = Math.floor(Math.random() * 10) % 3;
			  int i = (int)empCheck;
			  switch(i) {
			  case 1:
				  empHr = 8;
				  break;
			  case 2:
				  empHr = 4;
				  break;
			 default:
				 empHr = 0;
			  }
			 salary = empRatePerHr * empHr;
			 System.out.println("Salary for day" + day + " is :" + salary);
			 totalSalary = totalSalary + salary;
			 System.out.println("Total salary is :"+ totalSalary);
					 
			}
		}
}

