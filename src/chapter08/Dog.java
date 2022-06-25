package chapter08;

import chapter07.Soundable;

public class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}

}
