package io操作对象流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("class.txt"));
			Animal a1 = new Animal("tiger", 120, "red", "cat", 12, 20);
			Animal a2 = new Animal("eagle", 10, "gold", "bird", 6, 10);
			oos.writeObject(a1);
			oos.writeObject(a2);
			oos.flush();
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("class.txt"));
			Animal ra1 = (Animal) ois.readObject();
			System.out.println(ra1.toString());
			Animal ra2 = (Animal) ois.readObject();
			System.out.println(ra2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

