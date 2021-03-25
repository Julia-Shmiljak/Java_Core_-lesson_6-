package ua.lviv.lgs.ifaces;

public class EmployeeFixedMonthly extends Employee implements Salary{

	private double monthWage;
	int numberMonth;
	public EmployeeFixedMonthly(String name, double monthWage, int numberMonth) {
		super(name);
		this.monthWage = monthWage;
		this.numberMonth = numberMonth;
	}

	public double calcWage(){
		return monthWage * numberMonth;
	}


	@Override
	public void countSalary() {
		System.out.println("Заробітна плата у працівника " + getName() + ", за " + numberMonth + " місяці(в), становить: "
				+ calcWage() + "грн.");
		
	}

	

}
