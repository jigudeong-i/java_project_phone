package simplephoneinfo;
import java.util.Scanner;
public class PhoneBookVer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scan1;
		
		System.out.println("선택하세요\n1.데이터 입력\n프로그램 종료\n선택: ");	
		scan1 = input.nextInt();
		
		if(scan1 == 2) {
			System.out.println("프로그램을 종료합니다.");
		}
			
		else if(scan1 == 1) {
			System.out.println("이름 : ");
			
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			//continue
		}
		
		
		
		
		
	}
	
}
