package queen;

public class Queen {
	static boolean[] flagA=new boolean[8];//각 행에 퀸을 배치했는지
	static boolean[] flagB=new boolean[15];// /대각선 체크
	static boolean[] flagC=new boolean[15];// \대각선 체크
	static int[] pos=new int[8];// 각 열의 퀸 위치

	static int n=0;
	
	private static void set(int i) {
		for(int j=0;j<8;j++) {
			if(flagA[j]==false&&
					flagB[i+j]==false&&
					flagC[i-j+7]==false) {
				pos[i]=j;//퀸을 j에 배치
				if(i==7) {
					print();
				}
				else {
					flagA[j]=flagB[i+j]=flagC[i-j+7]=true;
					set(i+1);
					flagA[j]=flagB[i+j]=flagC[i-j+7]=false;
				}
			}
		}
		
	}
	private static void print() {
		n++;
		for(int i=0;i<8;i++) {
			System.out.printf("%2d",pos[i]);
		}
		System.out.println();
	
	}
	public static void main(String[] args) {
		set(0);
		System.out.println("총 가지수: "+n);

	}

	

}
