package team2_project;

import java.util.Scanner;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("========�߽Ĵ�==========");
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.¥��");
			System.out.println("2.«��");
			System.out.println(">>>>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
	            
	            System.out.println("¥���");
	            break;
	            
			case 2 :
	            
	            System.out.println("«��");
	            break;
	                
			}
			
		}

	}

}
