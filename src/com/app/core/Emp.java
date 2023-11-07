package com.app.core;

public class Emp {
	private int empId;
	private String name, deptName;
	private double salary;
	public Emp(int empId, String name, String deptName, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Emp)
		{
			return empId== ((Emp)o).empId && deptName.equals(((Emp)o).deptName);
			//Emp e=(Emp)o;
			//return empId== e.empId && deptName.equals(e.deptName);
		}
		return false;
	}
	@Override
	public  int hashCode()
	{
		System.out.println("in hashCode");
		return 23*(empId+deptName.hashCode());//followed the contract : equal objs ARE producing SAME hash code
		//return 10;
	}
	
	
}
