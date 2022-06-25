package chapter11;

import java.lang.reflect.Field;
import java.util.Iterator;

public class ClassExample {
	public static void main(String[] args) {
		
		try {
			Class sClass = Class.forName("chapter07.Student");
			System.out.println(sClass.getName());
			System.out.println(sClass.isInterface());
			System.out.println("메소드갯수 : " + sClass.getMethods().length);
			System.out.println("필드 : " + sClass.getFields().length);
			System.out.println("프라이빗 필드 : " + sClass.getDeclaredFields().length);
			
			Field[] declaredFields = sClass.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
