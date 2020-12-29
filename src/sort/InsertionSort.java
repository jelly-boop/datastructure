package sort;

import java.util.Scanner;

public class InsertionSort {
	private static void insertionSort(int[] a, int n) {
		for(int i=1;i<n;i++) {
			int j;
			int tmp=a[i];
			for(j=i;j>0&& a[j-1]>tmp;j--) {//���ʰŰ� ���õȰź��� ũ����
				a[j]=a[j-1];//���õ��ڸ��� ���ʰŷ� ��
			}
			a[j]=tmp;//���ڸ��� ����
		}
		
	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�ܼ� ���� ����");
		System.out.println("��� ��: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		insertionSort(a,n);
		System.out.println("������������ ����");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

	
}
