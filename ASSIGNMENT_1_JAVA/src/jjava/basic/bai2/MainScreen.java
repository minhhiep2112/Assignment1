package jjava.basic.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		try {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên dương:");
		int N = nhap.nextInt();
		nhap.nextLine();
		
		while (N<=0)
		{
			System.out.print("Vui lòng nhập số nguyên dương: ");
			N = nhap.nextInt();
			nhap.nextLine();
		}
		
		// tính tổng chẵn, lẻ
		int chan = 0;
		int le = 0;
		for(int i=0;i<=N;i++) {
			if(i%2==0) {
				chan = chan + i;
				}
			else if(i%2==1) {
				le = le + i;
				}
			}
		
		// đếm bao nhiêu số chia hết cho 3 nhưng không chia hết cho 2
		int x = 0;
		for(int i=0;i<=N;i++)
		{
			if(i%3==0 && i%2!=0)
			{
				x=x+1;
			}
		}
		
		// Xuất ra kết quả
		System.out.println("Tổng các số chẵn: " + chan);
		System.out.println("Tổng các số lẽ: "+le);
		System.out.println("Số chia hết cho 3 nhưng không chia hết cho 2 có: "+ x +" số");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("[Error] - Nhập sai định dạng");
		}
		
	}

}
