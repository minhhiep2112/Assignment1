package jjava.basic.bai3;


import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);
		String tieptuc = "Y";
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// Nhập vào Y thì tiếp tục nhập sinh viên
		while(tieptuc.equals("Y"))
			{
				Student student = new Student();
				student.setStudent(nhap);
				studentList.add(student);
				System.out.print("Do you want to continue?Y\\N  ");
				tieptuc = nhap.nextLine();
			
			// nếu nhập vào ko phải Y hoặc N thì tiếp tục hỏi
			while(!tieptuc.equals("Y") && !tieptuc.equals("N"))
				{
					System.out.print("Do you want to continue?Y\\N  ");
					tieptuc = nhap.nextLine();
				}
			}
		
		
		// In ra toàn bộ danh sách sinh viên
		System.out.println("----------------------------------");
		System.out.println("Student list:");
		for(int i=0;i<studentList.size();i++)
			{
				System.out.println("Student "+(i+1)+":");
				System.out.println(" - Full name: "+studentList.get(i).getfullName());
				System.out.println(" - Address: " + studentList.get(i).getaddress());
				System.out.println(" - DOB: "+studentList.get(i).getdob());
				System.out.println(" - Gender: "+studentList.get(i).getgender());
				System.out.println(" - Finale Grade: " + studentList.get(i).getfinalGrade());
				System.out.println();
			}
		
		// Xếp loại sinh viên
		System.out.println("----------------------------------");
		for(int i=0; i<studentList.size();i++)
		{	
			if(studentList.get(i).getfinalGrade()<4)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực kém");
			}
			else if (studentList.get(i).getfinalGrade()<5)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực yếu");
			}
			else if (studentList.get(i).getfinalGrade()<5.5)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực trung bình yếu");
			}
			else if (studentList.get(i).getfinalGrade()<6.5)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực trung bình");
			}
			else if (studentList.get(i).getfinalGrade()<7)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực trung bình khá");
			}
			else if (studentList.get(i).getfinalGrade()<8)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực khá");
			}
			else if (studentList.get(i).getfinalGrade()<8.5)
			{
				System.out.println(studentList.get(i).getfullName() + " học lực khá giỏi");
			}
			else 
			{
				System.out.println(studentList.get(i).getfullName() + " học lực giỏi");
			}
			
		}
		
		// tính điểm tổng kết trung bình
		System.out.println("----------------------------------");
		float tongdiem=0;
		
		for(int i=0;i<studentList.size();i++)
		{
			tongdiem = tongdiem + studentList.get(i).getfinalGrade();
		}
		float diemtrungbinh = tongdiem/studentList.size();
		
		System.out.println("Điểm trung bình: "+diemtrungbinh);
		
		
		
		
	}

}
