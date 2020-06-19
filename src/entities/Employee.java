package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double netSalary;

	public double netSalary() {
		netSalary= grossSalary-tax;
		return netSalary;
	}

	public void increaseSalary(double percentage) {
		grossSalary = grossSalary+ grossSalary*percentage/100;
		netSalary();
	}
}
