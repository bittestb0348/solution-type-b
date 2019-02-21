package problem04;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		int max = 20;
		int[] river = new int[max];
		int randNum = (int)(Math.random()*4 + 1);
		int count = 0; //시도 횟수
		int chkIdx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(chkIdx == 20) {			
			if(river[randNum] == 0) {//강
				chkIdx = 0;
				
				for(int i = 0; i < max; i++) {
					river[i] = (int)(Math.random()*2);
				}
			}
			else { //돌
				//엔터 입력
				continue;
			}
		}
	}

}
