package team2_project;

import java.util.Scanner;


<<<<<<< HEAD
import team2_project_menu_seohee.menu_seohee;
=======


import team2_project_jungyooseok.spicy_jungyooseok;
import team2_project_menu_nayujin.menu_nayujin;

>>>>>>> master

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
<<<<<<< HEAD

		menu_seohee cnt;
		cnt = new menu_seohee();

=======
		
		menu_nayujin mn = new menu_nayujin();
		spicy_jungyooseok j = new spicy_jungyooseok();
		
>>>>>>> master
		int num;
		System.out.println("========Áß½Ä´ç==========");
		while(true) {
			System.out.println("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä");
<<<<<<< HEAD
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

=======
			System.out.println("1.¸Þ´º ¼±ÅÃ");
			System.out.println("2.¼Ò½º, ¸Ê±â ¼±ÅÃ");
			System.out.println("3.°³¼ö ¼±ÅÃ");
			System.out.println("4.±Ý¾× È®ÀÎ");
			System.out.println(">>>>>>");
			num= input.nextInt();

			
			switch(num) {
			case 1 :
				System.out.println("1.Â¥Àå¸é 2.Â«»Í ");
				System.out.println(">>>>>>");
				num= input.nextInt();
				if(num==1) {
					System.out.println("Â¥Àå¸é ¼±ÅÃ");
				}else {
					System.out.println("Â«»Í ¼±ÅÃ");
				}
	            break;
	            
			case 2 :
				System.out.println("1. ¸Ê±âÁ¤µµ UP, 2. ¸Ê±âÁ¤µµ Down");
				int vi = input.nextInt();
				if(vi == 1) {
					j.spicyUp();
				}else if(vi  == 2 && j.spicy>0) {
					j.spicyDown();
				}
				System.out.println("ÇöÀç ¸Ê±â ´Ü°è : "+j.spicy);
				break;
				
			case 3 :
				System.out.println("°³¼ö¸¦ ¼±ÅÃÇÏ¼¼¿ä");

		
				break;
				
			case 4 :
				System.out.println("±Ý¾×À» È®ÀÎÇÕ´Ï´Ù");
				System.out.println("ÃÑ ±Ý¾×Àº " );
			default : 
				System.out.println("´Ù½Ã ¼±ÅÃÇÏ¼¼¿ä");    
			

			
		
			}
		
>>>>>>> master
		}

	}

<<<<<<< HEAD
	}
=======
		}
	
>>>>>>> master
