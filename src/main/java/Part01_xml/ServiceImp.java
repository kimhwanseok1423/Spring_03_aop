package Part01_xml;

import java.util.Random;

//�ٽ� ������ �����س��� Ŭ���� -Target
public class ServiceImp implements Service{
	public ServiceImp() {
		
}

	@Override
	public void prn1() {
	System.out.println("prn");
	}

	@Override
	public void prn1(int x) {
		System.out.println("x:"+x);
		
	}

	@Override
	public void prn1(Random ran) {
		System.out.println(ran.nextDouble());
		
	}

	@Override
	public void prn1(int a, int b) {
		System.out.printf("a=%d, b=%d\n", a,b);
		
	}

	@Override
	public void prn2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String prn3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prn4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prn5() {
		// TODO Auto-generated method stub
		
	}

	
}
