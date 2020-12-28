package bubbleSort;

import java.util.Scanner;

public class BubbleSort_ver2 {
	
	
	private static void bubbleSort(int[] a, int n) {
		int k=0;//a[k]보다 앞쪽은 정렬을 마친 상태
		while(k<n-1) {
			int last=n-1;//마지막으로 요소를 교환한 위치
			for(int j=n-1;j>k;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last=j;
				}
			}
			k=last;
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}

	public static void main(String[] args) {
		// 교환회수0일경우&앞쪽에서 교환회수0일경우 개선
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("==버블 정렬 버전2==");
		System.out.println("요솟 수: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		bubbleSort(a,n);
		System.out.println("::오름 차순으로 정렬::");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

	

}
