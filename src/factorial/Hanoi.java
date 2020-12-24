package factorial;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("~~~�ϳ���ž~~~");
		System.out.println("���� ����: ");
		int n=scanner.nextInt();
		
		move(n,1,3);//1�� ����� n���� ������ 3�� ������� �ű�
		

	}

	private static void move(int n, int x, int y) {
		if(n>1) {
			move(n-1,x,6-x-y);
		}
		System.out.println("���� ["+n+"]�� "+x+"��տ��� "+y+"������� �ű�!!");
		if(n>1) {
			move(n-1,6-x-y,y);
		}
		
	}

}
