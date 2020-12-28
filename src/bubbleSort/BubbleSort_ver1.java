package bubbleSort;

import java.util.Scanner;

public class BubbleSort_ver1 {
	
	private static void bubbleSort(int[] x, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {//pass
				if(x[j-1]>x[j]) {
					swap(x,j-1,j);
				}
			}
		}
		
	}

	private static void swap(int[] x, int i, int j) {
		int t=x[i];
		x[i]=x[j];
		x[j]=t;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("==버블 정렬 버전1==");
		System.out.println("요솟 수: ");
		int n=scanner.nextInt();
		int[]x=new int[n];
		
		for(int i=0;i<n;i++) {
			x[i]=(int)(Math.random()*100);
			System.out.print(x[i]+" ");
		}
		System.out.println();
		bubbleSort(x,n);
		System.out.println("::오름 차순으로 정렬::");
		for(int i=0;i<n;i++) {
			System.out.print(x[i]+" ");
		}

	}

	

}
