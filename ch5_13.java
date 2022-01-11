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
		System.out.println("��带 �����ϼ���. ������ : 1, �＼���� 3");
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
			System.out.println("�������� ���� ���Ӹ���Դϴ�.");
			break;
		}
	}
	
	public static void oneGame() {
		System.out.println("�������Դϴ�.");
		System.out.println("����(0), ����(1), ��(2)!");
		
		Scanner scan = new Scanner(System.in);
		int meCnt = scan.nextInt();
		int youCnt = (int)(Math.random()*3);
		
		int flag = calcur(meCnt, youCnt);
		
		if(flag ==1) {
			System.out.println("���� �¸�");
		}else {
			System.out.println("����� �¸�");
		}
	}

	public static void threeGame() {
		System.out.println("�＼�����Դϴ�.");
		System.out.println("����(0), ����(1), ��(2)!");
		
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
			System.out.println("�����ϴ�.");
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
		String[] Arr = {"����", "����", "��"};
		System.out.println("���� �Է� : "+Arr[meCnt]);
		System.out.println("����� �Է� : "+Arr[youCnt]);
	}
}
