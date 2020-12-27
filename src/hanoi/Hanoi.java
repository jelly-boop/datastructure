package hanoi;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ ���� �Է�: ");
		int n=scanner.nextInt();
		hanoi(n, 'A', 'B', 'C');
	}

	public static void hanoi(int i, char from, char mid, char to) {

		if (i == 1) {
			System.out.println(i + "�� " + from + "���� " + to + "�� �ű�ϴ�.");
		} else {
			hanoi(i - 1, from, to, mid);
			System.out.println(i + "�� " + from + "���� " + to + "�� �ű�ϴ�!!");
			hanoi(i - 1, mid, from, to);
		}
	}

}
