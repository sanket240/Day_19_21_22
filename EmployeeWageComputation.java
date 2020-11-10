public class EmployeeWageComputation {
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int WAGE_PER_HR=20;
	public static final int MAX_WORKING_DAYS=20;
	public static final int MAX_WORKING_HOURS=100;

	public static void EmployeeWageComputation() {
		 int empHr=0;
         	 int empWage=0;
	         int totalWage=0;
        	 int totalHours=0;
	         int totalWorkingDays=0;
        	 while (totalHours <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
                	totalWorkingDays++;
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
        	        totalHours += empHr;
                	System.out.println("Day: "+totalWorkingDays + " Employee Hrs: "+empHr);
		}
		System.out.println("Total working Hours: "+totalHours);
		System.out.println(" Total Working days: "+totalWorkingDays);
                totalWage=totalHours*WAGE_PER_HR;
                System.out.println(" Total Wage is: "+totalWage);
         }

	public static void main(String[] args){
		System.out.println("This is Employee Wage Computation problem");
		EmployeeWageComputation();
	}
}
