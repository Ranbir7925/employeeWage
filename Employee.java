import java.util.Random;
public class Employee{
	int wagePerHr=20;
	public void checkAttendance(){
		int isPresent=1;
		int isAbsent=0;
		Random random=new Random();
		int randomNumber=random.nextInt(2);
		if (randomNumber==isPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	public int getFullTimeWage(){
		int fullDayhrs=8;
		int fullTimeWage = wagePerHr * fullDayhrs;
		return fullTimeWage;
	}
	public int getPartTimeWage(){
		int partTimeHrs=4;
		int partTimeWage = wagePerHr * partTimeHrs;
		return partTimeWage;
	}
	public int checkEmployee(int random){
//		int isFullTime=1;
//		int isPartTime=2;
		switch(random){
			case 8:
				return getFullTimeWage();
			case 4:
				return getPartTimeWage();
		}
		return 0;
	}


	public int getWorkHrs(int random){
		int empHr=0;
		switch(random){
			case 1:
				empHr=8;
				break;
			case 2:
				empHr=4;
				break;
			default:
				empHr=0;
		}
		return empHr;
	}


	public void monthlyWage()
	{
	  Random rand = new Random();
	  int days=0;
	  int monthlyWage=0;
	  int wage=0;
	  int totalEmpHr=0;
	  int emphr=0;


	  while(days <20 && totalEmpHr<100){
		emphr=getWorkHrs(rand.nextInt(3));
		wage=checkEmployee(emphr);
		monthlyWage+=wage;
		totalEmpHr+=emphr;
		days++;
	  }
		System.out.println("Monthly Wage is: "+monthlyWage);
		System.out.println("Working hrs is: "+totalEmpHr);
	}
	public static void main(String[] args)
	{
		 System.out.println("Welcome to Employee Wage Computation");
		 Employee object=new Employee();
		 object.monthlyWage();

	}

}
