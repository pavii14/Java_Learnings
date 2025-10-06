package programs_Tasks_Day1;

public class Salary_calulator {
	 public static void main(String [] args)
	 {
		 int total_anual_salary=1200000;
		 double monthly_salary= total_anual_salary /12;
		 double weekly_salary = total_anual_salary/52;
		 double Day_salary = total_anual_salary/365;
		 double per_hour_salary= total_anual_salary/8760;
		 
		 System.out.println("=============================================");
			System.out.println("         salary calculator                               ");

			System.out.println("=============================================");
			System.out.println(" Total Annual Salary is = rs." +total_anual_salary);
			System.out.println(" Monthly Salary will be = rs." +monthly_salary);
			System.out.println(" Weekly Salary will be = rs." +weekly_salary);
			System.out.println(" Day Salary will be = rs." +Day_salary);
			System.out.println(" Hour Salary will be = rs." +per_hour_salary);
			
			
			
	 }
}
