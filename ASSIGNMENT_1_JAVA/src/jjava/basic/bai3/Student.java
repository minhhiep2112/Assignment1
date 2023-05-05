package jjava.basic.bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

	String fullName;
	String address;
	Date dob;
	String ngaysinh;
	String gender;
	float finalGrade;
	DateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy");
	
	//method nhập thông tin sinh viên
	void setStudent(Scanner nhap)
	{	
		try {
		System.out.println("Enter student's information:");
		System.out.print("Full name: ");
		fullName = nhap.nextLine();
		System.out.print("Address: ");
		address = nhap.nextLine();
		System.out.print("Date of birth (dd/mm/yyyy): ");
		ngaysinh = nhap.nextLine();
		
		dob = dinhdang.parse(ngaysinh);
		System.out.print("Gender: ");
		gender = nhap.nextLine();
		System.out.print("Final Grade: ");
		finalGrade = nhap.nextFloat();
		nhap.nextLine();}
		
		catch (ParseException e) {
			System.out.println("[Error] - Date format is not right!");
			System.out.println("Program end!");
			System.exit(0);
		}
		catch(InputMismatchException e)
		{
			System.out.println("[Error] - Wrong data type!");
			System.out.println("Program end!");
			System.exit(0);
		}
	}
	
	// medthod thay đổi từng thông tin riêng lẻ sinh viên
	void setfullName(String fullName) {this.fullName = fullName;}
	void setaddress(String address) {this.address = address;}
	void setdob(String ngaysinh)
	{
		try {
			dob = dinhdang.parse(ngaysinh);
		} catch (ParseException e) {
			System.out.println("[Error] - Date format is not right!");
			System.out.println("Program end!");
			System.exit(0);
	}
	}
	void setgender(String gender) {this.gender = gender;}
	void setfinalGrade(float finalGrade) {this.finalGrade = finalGrade;}
	
	
	// method lấy ra thông tin sinh viên
	String getfullName() {return fullName;}
	String getaddress() {return address;}
	String getdob() {return ngaysinh;}
	String getgender() {return gender;}
	float getfinalGrade( ) {return finalGrade;}
	
	
}
