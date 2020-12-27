package hanoi;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("원반의 수를 입력: ");
		int n=scanner.nextInt();
		hanoi(n, 'A', 'B', 'C');
	}

	public static void hanoi(int i, char from, char mid, char to) {

		if (i == 1) {
			System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
		} else {
			hanoi(i - 1, from, to, mid);
			System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다!!");
			hanoi(i - 1, mid, from, to);
		}
	}

}
