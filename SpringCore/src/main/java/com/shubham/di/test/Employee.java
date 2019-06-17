package com.shubham.di.test;

public class Employee implements Comparable<Employee>{
	
	int id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public boolean equals(Employee e) {
		
		if(this.id == e.id) {
			return true;
		}else {
		return false;
		}
	}
	
}
