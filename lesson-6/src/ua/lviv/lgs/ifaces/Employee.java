package ua.lviv.lgs.ifaces;

public abstract class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
}
