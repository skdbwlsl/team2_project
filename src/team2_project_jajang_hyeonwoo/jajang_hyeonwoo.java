package team2_project_jajang_hyeonwoo;

import java.util.Scanner;

public class jajang_hyeonwoo {
	public int jajang = 0;
	
	public void jajanInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("==== �� ���� ====");
		System.out.println("1.���� 2.����� 3.�ֹ� ���");
		int n1;
		n1 = input.nextInt();
		if(n1 == 1) jajangPlus();
		else if(n1 == 2) jajangPlus();
		else System.out.println("�ֹ����");
		
		}
	private void jajangPlus() {
		jajang++;
		System.out.println("¥��1����");
}
}