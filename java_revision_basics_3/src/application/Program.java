package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		int id;
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			id = sc.nextInt();
			if (i>0){
				while (idVerification(employees, id, i)) {
					System.out.println("Id already taken, try again: ");
					id = sc.nextInt();
				}
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
		}
				
		System.out.println("Enter the employee id that will have salary increase: ");
		id = sc.nextInt();
		if (idVerification(employees, id, n)) {
			System.out.print("Enter the percentage: ");
			double increase = sc.nextDouble(); 
			idIncrease(employees, id, n, increase);
		} else {
			System.out.println("This id does not exist!");
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		sc.close();
	}
	
	static boolean idVerification(List<Employee> employees, int id, int p) {
		for (int i = 0; i < p; i++) {
			if (id == employees.get(i).getId()) {
				return true;
			}
		}
		return false;
	}
	
	static void idIncrease(List<Employee> employees, int id, int n, double increase) {
		for (int i = 0; i < n; i++) {
			if (id == employees.get(i).getId()) {
				employees.get(i).increaseSalary(increase);
			}
		}
	}
	
	

}
