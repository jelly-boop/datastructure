package sort;

import java.util.Scanner;

public class HeapSort {
	private static void heapSort(int[] x, int n) {
		for(int i=(n-1)/2;i>=0;i--) {//i~n-1힙으로 만들기
			downHeap(x,i,n-1);
		}
		for(int i=n-1;i>0;i--) {
			swap(x,0,i);
			downHeap(x,0,i-1);
		}
		
	}

	private static void swap(int[] x, int i, int i2) {
		// TODO Auto-generated method stub
		
	}

	private static void downHeap(int[] a, int left, int right) {
		int temp=a[left];
		int child = 0;
		int parent;
		
		for(parent=left;parent<(right+1)/2;parent=child) {
			int cl=parent*2+1;
			int cr=cl+1;
			child=(cr<=right&&a[cr]>a[cl])? cr:cl;//큰 값 ㄴ노드를 자식에 대입
			if(temp>=a[child]) {
				break;
			}
			a[parent]=a[child];
			
		}
		a[parent]=temp;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("요솟 수: ");
		int n=scanner.nextInt();
		int[]x=new int[n];
		
		for(int i=0;i<n;i++) {
			x[i]=(int)(Math.random()*100);
			System.out.print(x[i]+" ");
		}
		System.out.println();
		heapSort(x,n);

	}

	

}
