import java.util.Random;
import java.util.Scanner;

public class RPSMinusOne {
	Scanner scannerInput = new Scanner(System.in);

	public void chooseUserFirst() {
		System.out.println("가위 바위 보 게임을 시작합니다!");
		System.out.println("다음 중 두개를 선택 해주세요.");
		System.out.println("가위 : 0, 바위 : 1, 보 : 2 ");
		String rspChooseInput = scannerInput.nextLine();
		
		int rspChooseFirst1 = Integer.parseInt(rspChooseInput);
		int rspChooseFirst2 = Integer.parseInt(rspChooseInput);
		String[] rspUserPrint = new String[2];

		if (rspChooseFirst1 == 0) {
			rspUserPrint[0] = "가위";
		} else if (rspChooseFirst1 == 2) {
			rspUserPrint[0] = "바위";
		} else {
			rspUserPrint[0] = "보";
		}
		if (rspChooseFirst2 == 0) {
			rspUserPrint[1] = "가위";
		} else if (rspChooseFirst2 == 2) {
			rspUserPrint[1] = "바위";
		} else {
			rspUserPrint[1] = "보";
		}

		System.out.println("사용자 : " + rspUserPrint[0] + ", " + rspUserPrint[1]);
	}

	public void chooseComFirst() {
		Random randNumber = new Random();
		randNumber(System.in);
		int rspChooseFirst1 = Integer.parseInt(rspChooseInput);
		int rspChooseFirst2 = Integer.parseInt(rspChooseInput);
		String[] rspUserPrint = new String[2];

		if (rspChooseFirst1 == 0) {
			rspUserPrint[0] = "가위";
		} else if (rspChooseFirst1 == 2) {
			rspUserPrint[0] = "바위";
		} else {
			rspUserPrint[0] = "보";
		}
		if (rspChooseFirst2 == 0) {
			rspUserPrint[1] = "가위";
		} else if (rspChooseFirst2 == 2) {
			rspUserPrint[1] = "바위";
		} else {
			rspUserPrint[1] = "보";
		}

		System.out.println("사용자 : " + rspUserPrint[0] + ", " + rspUserPrint[1]);
	}

	}

	public void chooseUserSecond() {

	}

	public void chooseComSecond() {

	}

	public void gameResult() {

	}

}
