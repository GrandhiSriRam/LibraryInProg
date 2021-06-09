package com.sriram.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sriram.bean.Book;
import com.sriram.service.EmployeeService;
import com.sriram.service.EmployeeServiceImpl;

import java.util.Date;
public class EmployeePresentationImpl implements EmployeePresentation{
	
	Scanner sc=new Scanner(System.in);
	private EmployeeService employeeService=new EmployeeServiceImpl();

	@Override
	public void showMenuEmp() {
		
		System.out.println("1. Lend a book");
		System.out.println("2. Return a book");
		System.out.println("3. View all books");
		System.out.println("4. Exit");
		
	}

	@Override
	public void performMenuEmp(int choice) {
//		System.out.println("Enter you ID");
//		int id=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Please enter the type of book you want:\na. Data Analytics\nb. Technology\nc. Management");
			String s=sc.nextLine();
			if(s.equals("a")) {
				ArrayList<Book>books=null;
				try {
					books = employeeService.showDataAnalytics();
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				
				for(Book b:books) {
					System.out.println(b);
				}
			}
			else if(s.equals("b")) {
				ArrayList<Book>books=null;
				try {
					books = employeeService.showTechnology();
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				
				for(Book b:books) {
					System.out.println(b);
				}
			}
			else if(s.equals("c")) {
				ArrayList<Book>books=null;
				try {
					books = employeeService.showManagement();
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				
				for(Book b:books) {
					System.out.println(b);
				}
			}
				System.out.println("Please select the book id from the above available books");
				int id=sc.nextInt();
				break;
//				if(employeeService.selectDataAnalytics(id)) {
//					System.out.println("Book issued successfully");
//				}
//				else {
//					System.out.println("Sorry !!! the book you got selected is out of stock");
//				}
//			}
//			else if(s.equals("b")) {
//				ArrayList<Book> books = employeeService.showTechnology();
//				for(Book b:books) {
//					System.out.println(b);
//				}
//				System.out.println("Please select the book id from the above available books");
//				int id=sc.nextInt();
//				if(employeeService.selectTechnology(id)) {
//					System.out.println("Book issued successfully");
//				}
//				else {
//					System.out.println("Sorry !!! the book you got selected is out of stock");
//				}
//			}
//			else if(s.equals("c")) {
//				ArrayList<Book> books = employeeService.showManagement();
//				for(Book b:books) {
//					System.out.println(b);
//				}
//				System.out.println("Please select the book id from the above available books");
//				int id=sc.nextInt();
//				if(employeeService.selectManagement(id)) {
//					System.out.println("Book issued successfully");
//				}
//				else {
//					System.out.println("Sorry !!! the book you got selected is out of stock");
//				}
//			}
//			break;
//		case 2:
//			System.out.println("Please enter the book id that you want to return");
//			int bookId=sc.nextInt();
//			employeeService.returnBook(bookId);
//			break;
//		case 3:
//			break;
		case 4:
			System.exit(0);
		}
		
	}
	
	
	

}
