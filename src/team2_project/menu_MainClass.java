package team2_project;

import java.util.Scanner;


import team2_project_menu_seohee.menu_seohee;
import team2_project_jungyooseok.spicy_jungyooseok;
import team2_project_menu_nayujin.menu_nayujin;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		menu_seohee cnt;
		cnt = new menu_seohee();


		menu_nayujin mn = new menu_nayujin();
		spicy_jungyooseok j = new spicy_jungyooseok();

		int num;

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

<<<<<<< HEAD
			
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
				System.out.println("�� �ݾ��� "  );
			default : 
				System.out.println("�ٽ� �����ϼ���");    
			

			
		
=======
		case 2 :
			System.out.println("1. �ʱ����� UP, 2. �ʱ����� Down");
			int vi = input.nextInt();
			if(vi == 1) {
				j.spicyUp();
			}else if(vi  == 2 && j.spicy>0) {
				j.spicyDown();
>>>>>>> 1e6c5ef5ab770d7b74e8aa7b00fdbcfe8911a36b
			}
			System.out.println("���� �ʱ� �ܰ� : "+j.spicy);
			break;


		case 3 :
			System.out.println("1. ¥��� �߰�  2. ¥��� ��� 3. «�� �߰� 4. «�� ���");
			System.out.println(">>");
			int c = input.nextInt();

			if(c == 1) {
				cnt.jajangCntUp();
				System.out.println("¥��� ����: " + cnt.jajangCnt);
				System.out.println("«�� ����: " + cnt.jjamppongCnt);
			} else if(c == 2 && cnt.jajangCnt>=0){
				cnt.jajangCntDown();
				System.out.println("¥��� ����: " + cnt.jajangCnt);
				System.out.println("«�� ����: " + cnt.jjamppongCnt);
			} else if(c == 3) {
				cnt.jjamppongCntUP();
				System.out.println("«�� ����: " + cnt.jjamppongCnt);
				System.out.println("¥��� ����: " + cnt.jajangCnt);
			} else if(c == 4 && cnt.jjamppongCnt>=0) {
				cnt.jjamppongCntDown();
				System.out.println("«�� ����: " + cnt.jjamppongCnt);
				System.out.println("¥��� ����: " + cnt.jajangCnt);
			} else {System.out.println("��ȣ�� Ȯ�����ּ���.");}


			break;

		case 4 :
			System.out.println("�ݾ��� Ȯ���մϴ�");
			System.out.println("�� �ݾ��� " );
		default : 
			System.out.println("�ٽ� �����ϼ���");    




		}


	}

}


