package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartphone = new Iphone();
		smartphone.call();
	
		smartphone = new Android();
		smartphone.call();
		
		smartphone = new WinPhone();
		smartphone.call();
		
		//final 변수 - 값을 변경할 수 없습니다.
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
	}

}
