package io操作对象流;

import java.io.Serializable;

public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer weight;
	private String color;
	private String type;
	private Integer age;
	private Integer lifetime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getLifetime() {
		return lifetime;
	}
	public void setLifetime(Integer lifetime) {
		this.lifetime = lifetime;
	}
	public Animal(String name, Integer weight, String color, String type, Integer age, Integer lifetime) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.type = type;
		this.age = age;
		this.lifetime = lifetime;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", color=" + color + ", type=" + type + ", age=" + age + ", lifetime=" + lifetime + "]";
	}
	
}

