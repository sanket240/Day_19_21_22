public class EmployeeWageComputation {
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int WAGE_PER_HR=20;
	public static final int MAX_WORKING_DAYS=20;

	public static void main(String[] args){
		System.out.println("This is Employee Wage Computation problem");
		int empHr=0;
		int empWage=0;
		int totalWage=0;
		for (int days=0; days<MAX_WORKING_DAYS; days++) {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee is Present");
				empHr=8;
				break;
			case IS_PART_TIME:
				System.out.println("Employee present part-time");
				empHr=4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHr=0;
	     	}
		empWage=empHr*WAGE_PER_HR;
		totalWage += empWage;
		System.out.println("Wage is: "+empWage);
		}
		System.out.println("Total Wage is: "+totalWage);
	}
}
