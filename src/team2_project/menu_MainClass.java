package team2_project;

import java.util.Scanner;

import team2_project_jungyooseok.spicy_jungyooseok;
import team2_project_menu_yujin.menu_yujin;
import team2_project_seohee.count_seohee;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		count_seohee cnt;
		cnt = new count_seohee();
		menu_yujin mn = new menu_yujin();

		spicy_jungyooseok j = new spicy_jungyooseok();

		int num;
		while(true) {
		System.out.println("1.?޴? ????");
		System.out.println("2.?ҽ?, ?ʱ? ????");
		System.out.println("3.?ֹ? Ȯ??");
		System.out.println(">>>>>>");
		num= input.nextInt();


		switch(num) {
		case 1 :
			System.out.println("1.¥???? 2.«?? ");
			System.out.println(">>>>>>");
			num= input.nextInt();
			
			if(num==1) {
				System.out.println("1.¥???? ?߰?  2. ¥???? ????");
				 int ja = input.nextInt();
				if(ja == 1) {
					cnt.jajangCntUp();
					System.out.println("¥???? ????: " + cnt.jajangCnt);
				} else if(ja == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("¥???? ????: " + cnt.jajangCnt);
				}
			}else {
				System.out.println("1. «?? ?߰?  2. «?? ????");
				int jjam = input.nextInt();
				if(jjam == 1) {
					cnt.jjamppongCntUP();
					System.out.println("«?? ????: " + cnt.jjamppongCnt);
				} else if(jjam == 2 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("«?? ????: " + cnt.jjamppongCnt);
				} else {System.out.println("??ȣ?? Ȯ?????ּ???.");}
			}
			break;
??
		case 2 :
			System.out.println("1. ?ʱ????? UP, 2. ?ʱ????? Down");
			int vi = input.nextInt();
			if(vi == 1) {
				j.spicyUp();
			}else if(vi  == 2 && j.spicy>0) {
				j.spicyDown();
			}
			System.out.println("???? ?ʱ? ?ܰ? : "+j.spicy);
			break;


		case 3 :
			System.out.println("<?ֹ? Ȯ??> ");
		System.out.println("¥????: " + cnt.jajangCnt +", «??: " + cnt.jjamppongCnt);
		
	
		
		default : 
			System.out.println("?ٽ? ?????ϼ???");    
		}



		}


	

	
		
	}

}


