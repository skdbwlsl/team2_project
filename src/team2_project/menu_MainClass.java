package team2_project;

import java.util.Scanner;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("========중식당==========");
		while(true) {
			System.out.println("1.메뉴 선택");
			System.out.println("2.소스, 맵기 선택");
			System.out.println("3.개수 선택");
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
				System.out.println("소스의 양, 맵기를 선택하세요 ");
	            
	            break;
			
			default : 
				System.out.println("다시 선택하세요");    
			}
		
		}

	}

		}
	
