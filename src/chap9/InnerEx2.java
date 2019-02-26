package chap9;
/*
 * 외부클래스의 private  멤버에 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv; //외부클래스의 private 멤버 접근 가능.
		int iiv2 = outercv;
	}
	static class StaticInner {  //클래스 멤버
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
