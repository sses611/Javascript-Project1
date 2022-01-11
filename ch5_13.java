package JavaStudy;

import java.awt.Menu;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.*;

public class ch5_13 {
		
	public static void main(String[] args) {
	
		gameStart();
		
	}
	
	public static void gameStart() {
		System.out.println("모드를 선택하세요. 한판전 : 1, 삼세판전 3");
		Scanner scan = new Scanner(System.in);

		int gameMode = scan.nextInt();
		
		switch (gameMode) {
		case 1:
			oneGame();
			break;
		case 3:
			threeGame();
			break;
		default:
			System.out.println("지정되지 않은 게임모드입니다.");
			break;
		}
	}
	
	public static void oneGame() {
		System.out.println("한판전입니다.");
		System.out.println("가위(0), 바위(1), 보(2)!");
		
		Scanner scan = new Scanner(System.in);
		int meCnt = scan.nextInt();
		int youCnt = (int)(Math.random()*3);
		
		int flag = calcur(meCnt, youCnt);
		
		if(flag ==1) {
			System.out.println("나의 승리");
		}else {
			System.out.println("당신의 승리");
		}
	}

	public static void threeGame() {
		System.out.println("삼세판전입니다.");
		System.out.println("가위(0), 바위(1), 보(2)!");
		
		int victory=0;

//		while(victory>=3) {	
//			Scanner scan = new Scanner(System.in);
//			int meCnt = scan.nextInt();
//			int youCnt = (int)(Math.random()*3);
//			
//			int flag = calcur(meCnt, youCnt);
//
//			if(flag==1) {
//				victory ++;
//			}else {
//				victory++;
//			}	
//		}
//		}
	}

	
	public static int calcur(int meCnt, int youCnt) {
		
		int result = 0;
		
		if(meCnt == youCnt) {
			System.out.println("비겼습니다.");
			resultPrint(meCnt, youCnt);
		}else if(meCnt==0 && youCnt==2 || meCnt==1 && youCnt==0 || meCnt==2 &&youCnt==1){
			result = 1;
			resultPrint(meCnt, youCnt);
		}else {
			result = 0;
			resultPrint(meCnt, youCnt);
		}
		return result;
		
	}
	public static void resultPrint(int meCnt, int youCnt) {
		String[] Arr = {"가위", "바위", "보"};
		System.out.println("나의 입력 : "+Arr[meCnt]);
		System.out.println("당신의 입력 : "+Arr[youCnt]);
	}
}
