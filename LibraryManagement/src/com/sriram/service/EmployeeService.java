package com.sriram.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sriram.bean.Book;

public interface EmployeeService {
//	Book lendBook(int id);
	ArrayList<Book> showDataAnalytics() throws ClassNotFoundException, SQLException;
	ArrayList<Book> showTechnology() throws ClassNotFoundException, SQLException;
	ArrayList<Book> showManagement() throws ClassNotFoundException, SQLException;
//	boolean selectDataAnalytics(int id);
//	boolean selectTechnology(int id);
//	boolean selectManagement(int id);
//	void returnBook(int id);
//	void returnBook();
//	ArrayList<Book> viewAllBooks();
}
