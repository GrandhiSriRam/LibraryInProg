package com.sriram.client;

import java.util.Scanner;

import com.sriram.presentation.*;

public class LibraryMain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		System.out.println("");
		
			
			System.out.println("Enter username");
			String username=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			
			//if(authenticateEmp(username,password){
			while(true) {
				employeePresentation.showMenuEmp();
				int choice=sc.nextInt();
				employeePresentation.performMenuEmp(choice);
			}
			
//			}
	
		
	}
	
}
