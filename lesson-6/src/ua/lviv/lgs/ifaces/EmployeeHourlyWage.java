package ua.lviv.lgs.ifaces;

public class EmployeeHourlyWage extends Employee implements Salary {
	
	private double hourWage;
	int hoursWorked;

	public EmployeeHourlyWage(String name, double hourWage, int hoursWorked) {
		super(name);
		this.hourWage = hourWage;
		this.hoursWorked = hoursWorked;
	}
	
	public double calcMonthWage() {
		return hourWage * hoursWorked;
	}

	
	@Override
	public void countSalary() {
		System.out.println("Заробітна плата, у працівника " + getName() + ", становить: " + calcMonthWage() + "грн.");
		
	}
	

}
