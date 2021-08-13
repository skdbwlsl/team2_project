package team2_project;

import java.util.Scanner;


<<<<<<< HEAD
=======

>>>>>>> master
import team2_project_jungyooseok.spicy_jungyooseok;
import team2_project_menu_nayujin.menu_nayujin;
import team2_project_seohee.count_seohee;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		

		menu_nayujin mn = new menu_nayujin();
		spicy_jungyooseok j = new spicy_jungyooseok();
		count_seohee cnt = new count_seohee();
		int num;

		while(true) {
		System.out.println("1.메뉴 선택");
		System.out.println("2.소스, 맵기 선택");
		System.out.println("3.개수 선택");
		System.out.println("4.금액 확인");
		System.out.println(">>>>>>");
		num= input.nextInt();

			
			switch(num) {
			case 1 :
				System.out.println("1.짜장면 2.짬뽕 ");
				System.out.println(">>>>>>");
				num= input.nextInt();
				if(num==1) {
					System.out.println("짜장면 선택");
				}else {
					System.out.println("짬뽕 선택");
				}
	            break;
	            
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
				System.out.println("1. 짜장면 추가  2. 짜장면 취소 3. 짬뽕 추가 4. 짬뽕 취소");
				System.out.println(">>");
				int c = input.nextInt();

				if(c == 1) {
					cnt.jajangCntUp();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				} else if(c == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				} else if(c == 3) {
					cnt.jjamppongCntUP();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				} else if(c == 4 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				} else {System.out.println("번호를 확인해주세요.");}

				break;

				
			case 4 :
				System.out.println("금액을 확인합니다");
				System.out.println("총 금액은 ");
			default : 
				System.out.println("다시 선택하세요");    
			

			
		


	

		}


	}

}

}
