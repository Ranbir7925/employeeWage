public class Employee {
	final static int FULL_TIME=2;
	final static int PART_TIME=1;
	static int dailyWage=0;
	static int workHours=0;
	static int totalWorkingDays=1;
	static int totalWages=0;
	static int totalWorkingHrs=0;
	static String company="";

	//Computes Total Wages  of an Employee in month
	public static int ComputeWage(int wage_per_hour, int max_working_days, int max_working_hours, String company) {
		Employee.company=company;
		while(totalWorkingDays<=max_working_days || totalWorkingHrs<=max_working_days) {
			int attendence = (int)(Math.random()*3);

			switch(attendence) {
				case FULL_TIME:
					workHours=8;
					break;
				case PART_TIME:
					workHours=4;
					break;
				default:
					workHours=0;

			}
			dailyWage=workHours*wage_per_hour;
			totalWorkingHrs+=workHours;
//            System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
			totalWorkingDays++;
		}
		return totalWorkingHrs*wage_per_hour;
	}

	public static void main(String[] args) {


		totalWages=Employee.ComputeWage(15, 4, 10, "Apple");
		System.out.println("Total wages of Employee in "+Employee.company+" Company ="+totalWages);

		totalWages=Employee.ComputeWage(22, 18, 100, "Jio");
		System.out.println("Total wages of Employee in "+Employee.company+" Company ="+totalWages);

	}
}