package jjava.basic.bai1; // đặt tên java.basic.bai1 sẽ thông báo lỗi

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMainClass {

	public static void main(String[] args) {
		try {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		double x = nhap.nextDouble();
		nhap.nextLine();
		System.out.print("Nhập số thứ hai: ");
		double y = nhap.nextDouble();
		nhap.nextLine();
		System.out.print("Nhập lệnh ACTION: ");
		String pheptinh = nhap.nextLine();
		
		if(pheptinh.equals("CONG")   || pheptinh.equals("cong") || pheptinh.equals("Cong"))
		{
			System.out.println("Kết quả phép tính cộng: " + CalculateUtils.tinhCong(x, y));
		}
		else if (pheptinh.equals("TRU") || pheptinh.equals("tru") || pheptinh.equals("Tru"))
		{
			System.out.println("Kết quả phép tính trừ: " + CalculateUtils.tinhTru(x, y));
		}
		else if (pheptinh.equals("NHAN") || pheptinh.equals("nhan") || pheptinh.equals("Nhan"))
		{
			System.out.println("Kết quả phép tính nhân: " + CalculateUtils.tinhNhan(x, y));
		}
		else if (pheptinh.equals("CHIA") || pheptinh.equals("chia") || pheptinh.equals("Chia"))
		{
			System.out.println("Kết quả phép tính chia: " + CalculateUtils.tinhChia(x, y));
		}
		else
		{
			System.out.println("Giá trị ACTION không hợp lệ");
		}
		}
		catch (InputMismatchException e)
		{
			System.out.println("[Error] - Sai định dạng!");
		}
	}

}
