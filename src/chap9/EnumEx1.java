package chap9;
/*
 * 열거형 :enum 예제. 
 */
public class EnumEx1 {
	public enum Car {
		AVANTE,SONATA,GRANDURE,K9
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("Car1 : " + car);
		car = Car.SONATA;
		System.out.println("Car2 : " + car);
		car = Car.K9;
		if(car instanceof Object) {
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
	}
}
