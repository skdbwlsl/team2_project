package team2_project;

import java.util.Scanner;

import team2_project_jungyooseok.spicy_jungyooseok;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		spicy_jungyooseok j = new spicy_jungyooseok();
		
		int num;
		System.out.println("========중식당==========");
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.짜장");
			System.out.println("2.짬뽕");
			System.out.println("3.맵기단계");
			System.out.println(">>>>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
	            
	            System.out.println("짜장면");
	            break;
	            
			case 2 :
	            
	            System.out.println("짬뽕");
	            break;
	            
			case 3 :
				System.out.println("1. 맵기정도 UP, 2. 맵기정도 Down");
				int vi = input.nextInt();
				if(vi == 1) {
					j.spicyUp();
				}else if(vi  == 2 && j.spicy>0) {
					j.spicyDown();
				}
				System.out.println("현재 맵기 단계 : "+j.spicy);
				break;
				
	            
			}
			
		}

	}

}
