import java.util.Random;
import java.util.Scanner;

public class RPSMinusOne {
	Scanner scannerInput = new Scanner(System.in);

	public int[] chooseUserFirst() {
		System.out.println("가위 바위 보 게임을 시작합니다!");
		System.out.println("다음 중 두개를 선택 해주세요.");
		System.out.println("가위 : 0, 바위 : 1, 보 : 2 ");
		String rspChooseInput1 = scannerInput.nextLine();
		String rspChooseInput2 = scannerInput.nextLine();
		
		int[] rspChooseFirst = new int[2];
		
		int rspChooseFirst1 = Integer.parseInt(rspChooseInput1);
		int rspChooseFirst2 = Integer.parseInt(rspChooseInput2);
		
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
		return rspChooseFirst;
	}

	public void chooseComFirst() {
		Random randNumber = new Random();
		int comChooseFrist1 = randNumber.nextInt(3);
		int comChooseFrist2 = randNumber.nextInt(3);

		int[] comChooseFrist = new int[2];

		if (comChooseFrist1 == 0) {
			rspUserPrint[0] = "가위";
		} else if (comChooseFrist1 == 2) {
			rspUserPrint[0] = "바위";
		} else {
			rspUserPrint[0] = "보";
		}
		if (comChooseFrist2 == 0) {
			rspUserPrint[1] = "가위";
		} else if (comChooseFrist2 == 2) {
			rspUserPrint[1] = "바위";
		} else {
			rspUserPrint[1] = "보";
		}

		System.out.println("사용자 : " + rspUserPrint[0] + ", " + rspUserPrint[1]);
	}
//	-----------------------------------

	public void chooseUserSecond() {
		// 사용자에거 두 선택지중 하나를 고르게 함.
		System.out.println("둘 중에 최종 선택할 것을 고르세요.");
		System.out.println("1 " + userInputPrint1);
		System.out.println("2 " + userInputPrint2);
		int userInput3 = s.nextInt();

		int userFinal;

		if (userInput3 == 1) {
			userFinal = userInput1;
		} else {
			userFinal = userInput2;
		}

		String userInputPrint3;
		if (userFinal == 1) {
			userInputPrint3 = "가위";
		} else if (userFinal == 2) {
			userInputPrint3 = "바위";
		} else {
			userInputPrint3 = "보";
		}
		System.out.println("사용자가 낸 것은 : " + userInputPrint3);

	}

	public void chooseComSecond() {
		// 컴퓨터가 하나를 임의로 고르기
		int comFinal;
		int comInput3 = r.nextInt(2);
		if (comInput3 == 0) {
			comFinal = comInput1;
		} else {
			comFinal = comInput2;
		}

		String comInputPrint3;
		if (comInput3 == 1) {
			comInputPrint3 = "가위";
		} else if (comInput3 == 2) {
			comInputPrint3 = "바위";
		} else {
			comInputPrint3 = "보";
		}
		System.out.println("컴퓨터가 낸 것은 : " + comInputPrint3);

	}

	public void gameResult() {
		// 승부 결과
		if (userFinal == comFinal) {
			System.out.println("비겼습니다.");
		} else if (userFinal == 1 && comFinal == 0) { // 가위 체크
			System.out.println("사용자 WIN");
		} else if (userFinal == 1 && comFinal == 2) {
			System.out.println("컴퓨터 WIN");
		} else if (userFinal == 2 && comFinal == 1) { // 바위 체크
			System.out.println("사용자 WIN");
		} else if (userFinal == 2 && comFinal == 0) {
			System.out.println("컴퓨터 WIN");
		} else if (userFinal == 0 && comFinal == 2) { // 보 체크
			System.out.println("사용자 WIN");
		} else if (userFinal == 0 && comFinal == 1) {
			System.out.println("컴퓨터 WIN");
		}
	}

}
