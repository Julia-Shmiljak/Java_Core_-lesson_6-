package ua.lviv.lgs.ifaces;

public class Main {
	public static void main(String[] args) {
		EmployeeHourlyWage worker1 = new EmployeeHourlyWage("�����", 150.5, 15);
		EmployeeFixedMonthly worker2 = new EmployeeFixedMonthly("����", 3500.9, 8);
		
		worker1.countSalary();
		worker2.countSalary();
		
	}

}
