package test;

//3. Outer2클래스의 내부클래스 Inner의 멤버변수 iv값 출력
class Outer2 {
	static class Inner { // 내부클래스의 객체의 자료형
		int iv = 200;
	}
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println(new Outer2.Inner().iv);
	}
}