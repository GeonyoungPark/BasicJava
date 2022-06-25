package chapter08;

public class Television implements Remotecontrol {
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	public void setVolume(int volume) {
		if(volume > Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		} else if(volume <Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
