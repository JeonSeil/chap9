package chap9;
/*
 * �ܺ�Ŭ������ private  ����� ����
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv; //�ܺ�Ŭ������ private ��� ���� ����.
		int iiv2 = outercv;
	}
	static class StaticInner {  //Ŭ���� ���
		//int siv = outeriv;
		int siv = new Outer2().outeriv;
		static int siv2 = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner si = new StaticInner();
	InstanceInner ii = new InstanceInner();
	static InstanceInner ii2 = new Outer2().new InstanceInner();
}
public class InnerEx2 {
	public static void main(String[] args) {

	}
}
