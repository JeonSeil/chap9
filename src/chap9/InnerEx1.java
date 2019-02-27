package chap9;
/*
 * ��øŬ����(����Ŭ����)
 * 1. Ŭ���� ���ο� �����ϴ� Ŭ����
 * 2. �����ڷ������� ��밡��. 
 *    ��üȭ ����. ObjectŬ������ ����Ŭ����.
 *    ���(����, �޼���, ������)��������
 * 3. �ܺ� Ŭ������ �����. �ܺ�Ŭ������ private ����� ���� ����.  
 * 
 *  ��øŬ������ ���� 
 * 1. �ν��Ͻ� ��øŬ���� : static ����� ������ �� ����. �� ����� ������.
 * 2. static ��øŬ���� : static ����� ������ �� �ִ�. 
 * 3. ���� ��øŬ����       : �޼��� �������� Ŭ������ ����� �� �ִ�.
 * 4. �̸�����(�͸���) ��øŬ����  : �߻�Ŭ������, �������̽��� ���� ��üȭ �� �� ����. 
 */
class Outer1 {
	class InstanceInner extends Object{ //�ν��Ͻ� ��øŬ����
		int iv = 100;
		final static int MAX = 200;
	}
	static class StaticInner {   //static ��øŬ����
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {   //���� ��øŬ���� : �޼��忡���� ����� ������ Ŭ����
			int iv = 600;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv + "," + LocalInner.MAX);
	}
	void method2() {
	//	LocalInner lc = new LocalInner(); //method �ܺο����� ��� �Ұ�
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		//��øŬ������ ��üȭ
		//1. �ν��Ͻ� ��øŬ����
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		System.out.println(ii.iv);
		System.out.println(Outer1.InstanceInner.MAX);
		//2. static ��øŬ����
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		new Outer1().method();		
	}
}
