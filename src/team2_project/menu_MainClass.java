package team2_project;

import java.util.Scanner;

import team2_project_jajang_hyeonwoo.jajang_hyeonwoo;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		jajang_hyeonwoo hy = new jajang_hyeonwoo();
		
		int num;
		System.out.println("========Áß½Ä´ç==========");
		while(true) {
			System.out.println("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä");
			System.out.println("1.Â¥Àå");
			System.out.println("2.Â«»Í");
			System.out.println(">>>>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
	            
	            System.out.println("Â¥Àå¸é");
	            hy.jajanInput();
	
	            break;
	            
			case 2 :
	            
	            System.out.println("Â«»Í");
	            break;
	                
			}

		}

	}

}
