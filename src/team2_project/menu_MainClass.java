package team2_project;

import java.util.Scanner;

import team2_project_jajang_hyeonwoo.jajang_hyeonwoo;

public class menu_MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		jajang_hyeonwoo hy = new jajang_hyeonwoo();
		
		int num;
		System.out.println("========�߽Ĵ�==========");
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.¥��");
			System.out.println("2.«��");
			System.out.println(">>>>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
	            
	            System.out.println("¥���");
	            hy.jajanInput();
	
	            break;
	            
			case 2 :
	            
	            System.out.println("«��");
	            break;
	                
			}

		}

	}

}
