package chap9;
/*
 * 내부클래스와 외부클래스의 멤버이름이 같은 경우 처리.
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 200;
			System.out.println("iv=" + iv);  //200
			System.out.println("this.iv=" + this.iv);//100
			System.out.println("Outer3.this.iv=" + Outer3.this.iv);//10
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oic = out.new InstanceInner();
		oic.method();
	}
}
