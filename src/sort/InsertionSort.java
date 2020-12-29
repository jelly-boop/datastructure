package sort;

import java.util.Scanner;

public class InsertionSort {
	private static void insertionSort(int[] a, int n) {
		for(int i=1;i<n;i++) {
			int j;
			int tmp=a[i];
			for(j=i;j>0&& a[j-1]>tmp;j--) {//왼쪽거가 선택된거보다 크면은
				a[j]=a[j-1];//선택된자리는 왼쪽거로 됨
			}
			a[j]=tmp;//그자리에 삽입
		}
		
	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("단순 삽입 정렬");
		System.out.println("요솟 수: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		insertionSort(a,n);
		System.out.println("오름차순으로 정리");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

	
}
