public class EmployeeWageComputation {
	public static void main(String[] args){
		System.out.println("This is Employee Wage Computation problem");
		int IS_FULL_TIME = 1;
		int WAGE_PER_HR=20;
		int empHr=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME){
			System.out.println("Employee is Present");
			empHr=8;
			}
		else{
			System.out.println("Employee is Absent");
			empHr=0;
		     }
		empWage=empHr*WAGE_PER_HR;
		System.out.println("Wage is: "+empWage);
	}
}
