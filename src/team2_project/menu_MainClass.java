package team2_project;

import java.util.Scanner;

import team2_project_jungyooseok.spicy_jungyooseok;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		spicy_jungyooseok j = new spicy_jungyooseok();
		
		int num;
		System.out.println("========�߽Ĵ�==========");
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.¥��");
			System.out.println("2.«��");
			System.out.println("3.�ʱ�ܰ�");
			System.out.println(">>>>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
	            
	            System.out.println("¥���");
	            break;
	            
			case 2 :
	            
	            System.out.println("«��");
	            break;
	            
			case 3 :
				System.out.println("1. �ʱ����� UP, 2. �ʱ����� Down");
				int vi = input.nextInt();
				if(vi == 1) {
					j.spicyUp();
				}else if(vi  == 2 && j.spicy>0) {
					j.spicyDown();
				}
				System.out.println("���� �ʱ� �ܰ� : "+j.spicy);
				break;
				
	            
			}
			
		}

	}

}
