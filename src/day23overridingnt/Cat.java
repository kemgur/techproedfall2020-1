package day23overridingnt;

public class Cat extends Animal{

	@Override
	void sound() {
		super.sound();
		System.out.println("Cats meow");
	}

	@Override
	protected void eat() {
		System.out.println("Cats like milk");
		super.eat();
	}

	@Override
	public int add() {
		System.out.println(super.age);//23
		System.out.println(super.name);//Ali
        return 1+2;
	}

	@Override
	public Integer multiply() {
        return 2*3;
	}

	@Override
	public Cat create() {
        return new Cat();
	}
	
}
