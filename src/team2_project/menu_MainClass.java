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
		System.out.println("1.메뉴 선택");
		System.out.println("2.소스, 맵기 선택");
		System.out.println("3.주문 확인");
		System.out.println(">>>>>>");
		num= input.nextInt();


		switch(num) {
		case 1 :
			System.out.println("1.짜장면 2.짬뽕 ");
			System.out.println(">>>>>>");
			num= input.nextInt();
			
			if(num==1) {
				System.out.println("1.짜장면 추가  2. 짜장면 취소");
				 int ja = input.nextInt();
				if(ja == 1) {
					cnt.jajangCntUp();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				} else if(ja == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				}
			}else {
				System.out.println("1. 짬뽕 추가  2. 짬뽕 취소");
				int jjam = input.nextInt();
				if(jjam == 1) {
					cnt.jjamppongCntUP();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				} else if(jjam == 2 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				} else {System.out.println("번호를 확인해주세요.");}
			}
			break;
ㄴ
		case 2 :
			System.out.println("1. 맵기정도 UP, 2. 맵기정도 Down");
			int vi = input.nextInt();
			if(vi == 1) {
				j.spicyUp();
			}else if(vi  == 2 && j.spicy>0) {
				j.spicyDown();
			}
			System.out.println("현재 맵기 단계 : "+j.spicy);
			break;


		case 3 :
			System.out.println("<주문 확인> ");
		System.out.println("짜장면: " + cnt.jajangCnt +", 짬뽕: " + cnt.jjamppongCnt);
		
	
		
		default : 
			System.out.println("다시 선택하세요");    
		}



		}


	

	
		
	}

}


