package team2_project;

import java.util.Scanner;


import team2_project_menu_seohee.menu_seohee;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		menu_seohee cnt;
		cnt = new menu_seohee();

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
				
				break;
			case 2 :

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
		
				


			}

		}

	}

	}
