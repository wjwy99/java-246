package java246;

public class Z extends Thread {

@Override
	public void run() {
		//TODO Auto-generated method stub
		// super.run();
		for (int i=0;i<2000;i++) {
			System.out.println(i+ "+++���߳�+++");
		}
	}

	public static void main(String[] args) {
		Z thread =new Z();
		thread.start();
		// TODO Auto-generated method stub
for (int i=0; i<=2000; i++) {
	System.out.println(i + "---���߷���---");
}

}
}
