package chap9;
/*
 * 중첩클래스(내부클래스)
 * 1. 클래스 내부에 존재하는 클래스
 * 2. 참조자료형으로 사용가능. 
 *    객체화 가능. Object클래스의 하위클래스.
 *    멤버(변수, 메서드, 생성자)소유가능
 * 3. 외부 클래스의 멤버임. 외부클래스의 private 멤버에 접근 가능.  
 * 
 *  중첩클래스의 종류 
 * 1. 인스턴스 중첩클래스 : static 멤버를 소유할 수 없다. 단 상수는 가능함.
 * 2. static 중첩클래스 : static 멤버를 소유할 수 있다. 
 * 3. 지역 중첩클래스       : 메서드 내에서만 클래스를 사용할 수 있다.
 * 4. 이름없는(익명의) 중첩클래스  : 추상클래스나, 인터페이스를 직접 객체화 할 때 사용됨. 
 */
class Outer1 {
	class InstanceInner extends Object{ //인스턴스 중첩클래스
		int iv = 100;
		final static int MAX = 200;
	}
	static class StaticInner {   //static 중첩클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {   //지역 중첩클래스 : 메서드에서만 사용이 가능한 클래스
			int iv = 600;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv + "," + LocalInner.MAX);
	}
	void method2() {
	//	LocalInner lc = new LocalInner(); //method 외부에서는 사용 불가
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		//중첩클래스의 객체화
		//1. 인스턴스 중첩클래스
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		System.out.println(ii.iv);
		System.out.println(Outer1.InstanceInner.MAX);
		//2. static 중첩클래스
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		new Outer1().method();		
	}
}
