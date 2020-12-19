package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a[]= {2,34,1,35,77,45,67,43,45,90,67,37,11,12,39};
		Arrays.sort(a);//��������
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.println("�˻��� ��ȣ�� �Է� �ϼ���: ");
		int key=scanner.nextInt();
		if(searchBinary(a,key)<0) {
			System.out.println(key+"�� ���� ����Դϴ�.");
		}else {
			System.out.println(key+"�� "+searchBinary(a,key)+"��° ��� �Դϴ�.");
		}
		
	}

	private static int searchBinary(int[] a, int key) {
		int pl=0;
		int pr=a.length-1;
		
		
		while(pl<=pr) {
			int pc=(pl+pr)/2;
			if(key==a[pc]) {
				return pc;
			}else {
				if(key>a[pc]) {//�޺κ�����..
					pl=pc+1;
				}else {
					pr=pc-1;
				}
			}
		}
		return -1;
		
	}

}
