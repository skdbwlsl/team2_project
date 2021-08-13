package team2_project;

import java.util.Scanner;


import team2_project_menu_seohee.menu_seohee;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		menu_seohee cnt;
		cnt = new menu_seohee();

		int num;
		System.out.println("========Áß½Ä´ç==========");
		while(true) {
			System.out.println("¸Ş´º¸¦ ¼±ÅÃÇÏ¼¼¿ä");
			System.out.println("1.Â¥Àå");
			System.out.println("2.Â«»Í");
			System.out.println(">>>>>");
			num = input.nextInt();

			switch(num) {
			case 1 :
				
				break;
			case 2 :

				break;
				
			case 3 :
				System.out.println("1. Â¥Àå¸é Ãß°¡  2. Â¥Àå¸é Ãë¼Ò 3. Â«»Í Ãß°¡ 4. Â«»Í Ãë¼Ò");
				System.out.println(">>");
				int c = input.nextInt();
				
				if(c == 1) {
					cnt.jajangCntUp();
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
				} else if(c == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
				} else if(c == 3) {
					cnt.jjamppongCntUP();
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
				} else if(c == 4 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
				} else {System.out.println("¹øÈ£¸¦ È®ÀÎÇØÁÖ¼¼¿ä.");}
		
				


			}

		}

	}

	}
