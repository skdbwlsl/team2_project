package team2_project;

import java.util.Scanner;

import team2_project_Menu_nayujin.menu_nayujin;
import team2_project_jungyooseok.spicy_jungyooseok;


public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		menu_nayujin mn = new menu_nayujin();
		spicy_jungyooseok j = new spicy_jungyooseok();
		
		int num;
		System.out.println("========�߽Ĵ�==========");
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.�޴� ����");
			System.out.println("2.�ҽ�, �ʱ� ����");
			System.out.println("3.���� ����");
			System.out.println("4.�ݾ� Ȯ��");
			System.out.println(">>>>>>");
			num= input.nextInt();

			
			switch(num) {
			case 1 :
				System.out.println("1.¥��� 2.«�� ");
				System.out.println(">>>>>>");
				num= input.nextInt();
				if(num==1) {
					System.out.println("¥��� ����");
				}else {
					System.out.println("«�� ����");
				}
	            break;
	            
			case 2 :
				System.out.println("1. �ʱ����� UP, 2. �ʱ����� Down");
				int vi = input.nextInt();
				if(vi == 1) {
					j.spicyUp();
				}else if(vi  == 2 && j.spicy>0) {
					j.spicyDown();
				}
				System.out.println("���� �ʱ� �ܰ� : "+j.spicy);
				break;
				
			case 3 :
				System.out.println("������ �����ϼ���");

		
				break;
				
			case 4 :
				System.out.println("�ݾ��� Ȯ���մϴ�");
				
			default : 
				System.out.println("�ٽ� �����ϼ���");    
			

			
		
			}
		
		}

	}

		}
	
