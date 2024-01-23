package com.yedam.classes.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		Animal animal = null; // new Animal() <--추상클래스이므로 객체 생성불가. 따라서 null로 처리하거나 생략.
//		Bird(자식클래스)를 이용해 객체 생성가능.
		animal = new Bird("제비");
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird("참새");
		bird.eat();
		bird.sleep();
		
		Dog dog = new Dog();
//		birds[0] = dog;
		
		Animal[] animals = new Animal[10];
		animals[0] = bird;
		animals[1] = dog;
	}

}
