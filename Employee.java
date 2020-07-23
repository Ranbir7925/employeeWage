import java.util.Random;
public class Employee {
	int wagePerHr = 20;


	public void checkAttendance() {
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		if (randomNumber == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}


	public int getFullTimeWage() {
		int fullDayhrs = 8;
		int fullTimeWage = wagePerHr * fullDayhrs;
		return fullTimeWage;
	}


	public int getPartTimeWage() {
		int partTimeHrs = 4;
		int partTimeWage = wagePerHr * partTimeHrs;
		return partTimeWage;
	}


	public int checkEmployee(int random) {
		switch (random) {
			case 8:
				return getFullTimeWage();
			case 4:
				return getPartTimeWage();
			default:
				return 0;
		}
	}


	public int getWorkHrs(int random) {
		int empHr = 0;
		switch (random) {
			case 1:
				return empHr = 8;
			case 2:
				return empHr = 4;
			default:
				return empHr = 0;
		}
	}


	public void monthlyWage() {
		Random rand = new Random();
		int days = 0, monthlyWage = 0, wage = 0, totalEmpHr = 0, emphr = 0;

		while (days < 20 && totalEmpHr < 100) {
			emphr = getWorkHrs(rand.nextInt(3));
			wage = checkEmployee(emphr);
			monthlyWage += wage;
			totalEmpHr += emphr;
			days++;
		}
		System.out.println("Monthly Wage is: " + monthlyWage);
		System.out.println("Total Working hrs is: " + totalEmpHr);
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		Employee object = new Employee();
		object.monthlyWage();
	}
}
