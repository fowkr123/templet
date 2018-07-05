package innerclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx obj = new ThreadEx();
		obj.start();

		Thread th = new Thread() {
			public void run() {
				try {
					for (int i = 10; i < 20; i++) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {
				}
			}
		};
		th.start();
	}
}
