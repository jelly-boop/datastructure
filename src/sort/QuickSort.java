package sort;

import java.util.Scanner;

public class QuickSort {
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);

	}

	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);//나눈거에 첫번째 인덱스 반환
		if (start < part2 - 1) {
			quickSort(arr, start, part2 - 1);//앞 파트 나누기
		}
		if (part2 < end) {
			quickSort(arr, part2, end);//뒤 파트 나누기
		}

	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];// 그 범위내의 중간지점으로 설정
		while (start <= end) {// 만날때 까지
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;

	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("요솟 수: ");
		int n=scanner.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		quickSort(arr);
		printArray(arr);
		

	}

}
