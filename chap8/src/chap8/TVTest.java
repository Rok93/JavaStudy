package chap8;

interface TV {
	void turnOn();
	void turnOff();
	default void channel() {//공통구현(객체마다 포함. 오버라이딩가능)
		System.out.println("tv는 기본적으로 10개 채널을 제공합니다.");
		//default 선언하면 인터페이스에 메소드 구현 가능 ! 
		//변경사항이 있을경우에만 Override 해준다.
	}
	static void remote() {//공통(객체 1개 공유. 오버라이딩불가능)
		System.out.println("tv는 리모컨으로 조정합니다.");
		//static 선언하면 인터페이스에 메소드 구현 가능 ! 
	}
}

class SamsungTV implements TV {

	void product() {
		System.out.println("수원공장 제조");
	}

	@Override
	public void turnOn() {
		System.out.println("삼성TV 전원켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성TV 전원끄다");
	}

	@Override
	public void channel() {
		System.out.println("삼성tv는 15개 채널을 확장제공합니다.");
	}

}

class LGTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("엘지TV 전원끄다");
	}

	@Override
	public void turnOff() {
		System.out.println("엘지TV 전원끄다");
	}

}

public class TVTest {

	public static void main(String[] args) {

		TV.remote();
		TV s = new SamsungTV();
		TV l = new LGTV();

		s.turnOn();// 서로 다른 내용 실행
		s.turnOff();
		l.turnOn();
		l.turnOff();
		s.channel();
		l.channel();
		TV[] tv = new TV[2];
		tv[0] = s;
		tv[1] = l;

		for(int i = 0; i < tv.length; i ++) {
			if(tv[i] instanceof SamsungTV)
				((SamsungTV)tv[i]).product();
		}
	}
}
