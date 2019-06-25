package example;

class Screen {
	int size;
	void setSize(int s) {
		size = s;
		System.out.println("화면 크기 " + size + " 조정되었습니다.");
	}
}

class TV extends Screen implements Volume{
	String model;
	int vol = 0;;
	void powerOn() {
		System.out.println(model + " TV 전원을 켭니다.");
	}

	void powerOff() {
		System.out.println(model + " TV 전원을 끕니다.");
	}

	@Override
	public void volumeUp(int vol) {
		this.vol += vol;
		System.out.println("tv : " + vol + "볼륨 증가하여 " + this.vol);
	}

	@Override
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("tv : " + vol + "볼륨 감소하여 " + this.vol);
	}

}

class Mobile {
	String wifi;
	void setWifi(String w) {
		wifi = w;
		System.out.println(wifi + " 와이파이를 사용중입니다.");
	}
}

class Phone extends Mobile implements Volume{
	int vol = 0;;
	String[] apps = { "유튜브" , "구글맵" , "카메라" , "인터넷" } ;

	void startApp(String app) {
		boolean result = false;

		for(String str : apps) {
			if(str.equals(app)) {
				System.out.println(app + " 앱이 시작되었습니다.");
				result = true;
				break;
			}
		} //for end
		if(!result)
			System.out.println(app + " 앱은 설치부터 하세요.");
	}
	void stopApp() {
		System.out.println("모든 앱이 중단되었습니다.");
	}

	@Override
	public void volumeUp(int vol) {
		this.vol += vol;
		if( this.vol > maxVol)
			this.vol = maxVol;
		System.out.println("폰 : " + vol + "볼륨 증가하여 " + this.vol);

	}

	@Override
	public void volumeDown(int vol) {
		this.vol -= vol;
		if( this.vol < minVol)
			this.vol = minVol;
		System.out.println("폰 : " + vol + "볼륨 감소하여 " + this.vol);
	}


}

class Radio implements Volume {
	int vol = 0;;
	double freq;
	void setFreq(double d) {
		freq = d;
		System.out.println("라디오 : 주파수 " + freq + "로 조정되었습니다.");
	}

	@Override
	public void volumeUp(int vol) {
		this.vol += (2*vol);
		if( this.vol > maxVol)
			this.vol = maxVol;
		System.out.println("라디오 : " + vol + "볼륨 증가하여 " + this.vol);
	}

	@Override
	public void volumeDown(int vol) {
		this.vol -= (2*vol);
		if( this.vol < minVol)
			this.vol = minVol;
		System.out.println("라디오 : " + vol + "볼륨 감소하여 " + this.vol);
	}



}

interface Volume {
	int maxVol = 50; //public static final 으로 자동 선언된다! 
	int minVol = 0;

	/*public*/static void notice() {
		System.out.println("볼륨은 최소 " + minVol + "부터 최대 " + maxVol + "까지 조정가능합니다.");
	};

	/*public*/default void work() { // TV, Phone, Radio 동일 
		System.out.println("===현재 볼륨 조정중입니다===");
	}

	/*public abstract*/void volumeUp(int vol);
	/*public abstract*/void volumeDown(int vol);
}

public class VolumeTest {
	public static void main(String[] args) {
		Radio r = new Radio();
		r.setFreq(89.1);
		Phone p = new Phone();
		p.setWifi("kitri005");	//Mobile 상속
		p.startApp("인터넷");
		p.startApp("유튜브");
		p.startApp("키트리");
		p.stopApp();

		TV t = new TV();
		t.model = "2019new";
		t.setSize(50);
		t.powerOn();
		t.powerOff();

		//여기서 부터 내가 직접 구현하기 ! (Volume interface 설정...) 
		Volume.notice(); // Volume 에 static 메소드로 정의 되어있어야 함 !
		//== 볼륨은 최소 0 부터 최대 50 까지 조정 가능합니다.
		Volume[] v = new Volume[3];
		v[0] = r; //Radio 객체
		v[1] = p; //Phone 객체
		v[2] = t; //TV객체 

		for(int i = 0 ; i < v.length; i++) {
			v[i].work(); //===현재 볼륨 조정중입니다===
			v[i].volumeUp(10);
			v[i].volumeUp(10);
			v[i].volumeUp(100);
			v[i].work(); //===현재 볼륨 조정중입니다===
			v[i].volumeDown(20);
			v[i].volumeDown(20);
			v[i].volumeDown(200);
			System.out.println();
		}
	}
}
