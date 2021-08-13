package team2_project;

import java.util.Scanner;

import team2_project_jungyooseok.spicy_jungyooseok;
import team2_project_seohee.count_seohee;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		count_seohee cnt;
		cnt = new count_seohee();


		spicy_jungyooseok j = new spicy_jungyooseok();

		int num;
		while(true) {
		System.out.println("1.¸Þ´º ¼±ÅÃ");
		System.out.println("2.¼Ò½º, ¸Ê±â ¼±ÅÃ");
		System.out.println("3.±Ý¾× È®ÀÎ");
		System.out.println(">>>>>>");
		num= input.nextInt();


		switch(num) {
		case 1 :
			System.out.println("1.Â¥Àå¸é 2.Â«»Í ");
			System.out.println(">>>>>>");
			num= input.nextInt();
			
			if(num==1) {
				System.out.println("1.Â¥Àå¸é Ãß°¡  2. Â¥Àå¸é Ãë¼Ò");
				 int ja = input.nextInt();
				if(ja == 1) {
					cnt.jajangCntUp();
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
				} else if(ja == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
				}
			}else {
				System.out.println("1. Â«»Í Ãß°¡  2. Â«»Í Ãë¼Ò");
				int jjam = input.nextInt();
				if(jjam == 1) {
					cnt.jjamppongCntUP();
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
				} else if(jjam == 2 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("Â«»Í °¹¼ö: " + cnt.jjamppongCnt);
					System.out.println("Â¥Àå¸é °¹¼ö: " + cnt.jajangCnt);
				} else {System.out.println("¹øÈ£¸¦ È®ÀÎÇØÁÖ¼¼¿ä.");}
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
			System.out.println("±Ý¾×À» È®ÀÎÇÕ´Ï´Ù");
			System.out.println("ÃÑ ±Ý¾×Àº " );
		default : 
			System.out.println("´Ù½Ã ¼±ÅÃÇÏ¼¼¿ä");    
		}



		}


	}

}


