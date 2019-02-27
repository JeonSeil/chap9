package test;

/*
1. ���� �ҽ��� ������ ������ �߻��Ѵ�. ����� "Tested" �� ��µǵ��� ���α׷��� �����ϰ�
������ ������ �����ϱ�.
*/
interface Beta {
}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}

public class InterfaceEx01 {
	static Beta getIt() {
		return new Alpha();
	}

	public static void main(String[] args) {
		Beta b = getIt();
		if(b instanceof Alpha) {
//			Alpha a = (Alpha)b;
//		    System.out.println(a.testIt());
			System.out.println(((Alpha)b).testIt());
		}
//		System.out.println(b.testIt());
	}
}