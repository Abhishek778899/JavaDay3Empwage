
public class DailyWage {

	public static void main(String[] args) 
	{
		
		final int IS_FULL_TIME = 1;
	    final int EMP_RATE_PER_HOUR = 20;

	    

	           // Initializing variables
	           int EmpWage = 0, empHrs = 0;

	           // Computations
	           double empCheck = Math.floor(Math.random() * 10) % 2;

	           if(empCheck == IS_FULL_TIME) {
	                 System.out.println("Employee is Present");
	                      empHrs = 8;
	           } else {
	                 System.out.println("Employee is Absent");
	                      empHrs = 0;
	           }
	           EmpWage = empHrs * EMP_RATE_PER_HOUR;
	           System.out.println("To Calculate Dailly Employee Wage: " + EmpWage);

		}

	
		// TODO Auto-generated method stub

	}


