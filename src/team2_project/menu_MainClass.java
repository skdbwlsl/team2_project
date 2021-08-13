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
		System.out.println("========중식당==========");
		while(true) {
			System.out.println("메뉴를 선택하세요");
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
				System.out.println("개수를 선택하세요");

		
				break;
				
			case 4 :
				System.out.println("금액을 확인합니다");
				
			default : 
				System.out.println("다시 선택하세요");    
			

			
		
			}
		
		}

	}

		}
	
