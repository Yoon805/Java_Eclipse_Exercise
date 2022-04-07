import java.util.Scanner;

public class RunRPS {
	public static void main(String[] args) {
		RPSMinusOne rpsMinusOne = new RPSMinusOne();

		for (int i = 0; i < 9999; i++) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("게임을 하시겠습니까?");
			System.out.println("엔터 : 게임 시작");
			System.out.println("q : 게임 종료");
			String inputString = userInput.nextLine();

			if (inputString.equals("q")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				rpsMinusOne.chooseUserFirst();
				rpsMinusOne.chooseComFirst();
				rpsMinusOne.chooseUserSecond();
				rpsMinusOne.chooseComSecond();
				rpsMinusOne.gameResult();
			}

		}
	}
}
