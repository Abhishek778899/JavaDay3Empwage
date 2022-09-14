
public class Addparttime {

	public static void main(String[] args) 
	{
		int is_FULL = 1;
		int is_PART = 2;
		int empRatePerHr = 20;
		int empWorkingHr;
		double empCheck = Math.floor(Math.random() * 10) % 3;
	    if(empCheck == is_FULL) 
			empWorkingHr = 8; 
		else if(empCheck == is_PART)
		    empWorkingHr = 4;
		 else
		    empWorkingHr = 0;
	    int salary = empRatePerHr * empWorkingHr;   
	    System.out.println("Salary is :" + salary);	
	}
}


