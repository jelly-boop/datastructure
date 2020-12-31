package sort;

import java.util.Scanner;

public class MergeSort {
	private static void mergeSort(int[]arr) {
		int[]tmp=new int[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);//배열,임시저장소,시작과 끝 인덱스 넘겨줌
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {//재귀함수
		if(start<end) {
			int mid=(start+end)/2;//배열의 가운데
			mergeSort(arr,tmp,start,mid);//배열 앞부분
			mergeSort(arr,tmp,mid+1,end);//배열 뒤부분
			merge(arr,tmp,start,mid,end);//배열 병합
		}
		
		
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for(int i=start;i<=end;i++) {//배열 복사
			tmp[i]=arr[i];
		}
		int part1=start;
		int part2=mid+1;
		int index=start;
		while(part1<=mid&&part2<=end) {//둘다 끝까지 갈 때까지.
			if(tmp[part1]<=tmp[part2]) {
				arr[index]=tmp[part1];
				part1++;
			}else {
				arr[index]=tmp[part2];
				part2++;
			}
			index++;
			
		}
		for(int i=0;i<=mid-part1;i++) {//배열이 남은경우 대비,, 
			 arr[index+i]=tmp[part1+i];//남은 값 붙여줌
			
		}
		
	}
	private static void printArray(int[]arr) {
		for(int data:arr) {
			System.out.print(data+" ");
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
		mergeSort(arr);
		printArray(arr);

	}

}
