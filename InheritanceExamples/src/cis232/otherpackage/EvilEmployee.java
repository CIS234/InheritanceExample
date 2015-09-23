package cis232.otherpackage;

import cis232.example.Employee;

public class EvilEmployee extends Employee{
	public String getName(){
		rate = -10;
		return String.format("Evil %d", rate);
	}
}
