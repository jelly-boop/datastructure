package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a[]= {2,34,1,35,77,45,67,43,45,90,67,37,11,12,39};
		Arrays.sort(a);//오름차순
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.println("검색할 번호를 입력 하세요: ");
		int key=scanner.nextInt();
		if(searchBinary(a,key)<0) {
			System.out.println(key+"는 없는 요소입니다.");
		}else {
			System.out.println(key+"는 "+searchBinary(a,key)+"번째 요소 입니다.");
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
				if(key>a[pc]) {//뒷부분으로..
					pl=pc+1;
				}else {
					pr=pc-1;
				}
			}
		}
		return -1;
		
	}

}
